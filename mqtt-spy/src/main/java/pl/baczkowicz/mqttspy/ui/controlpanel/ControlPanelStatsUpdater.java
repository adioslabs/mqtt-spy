/***********************************************************************************
 * 
 * Copyright (c) 2014 Kamil Baczkowicz
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 * The Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * 
 *    Kamil Baczkowicz - initial API and implementation and/or initial documentation
 *    
 */
package pl.baczkowicz.mqttspy.ui.controlpanel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import pl.baczkowicz.mqttspy.stats.StatisticsManager;
import pl.baczkowicz.mqttspy.ui.ControlPanelItemController;
import pl.baczkowicz.spy.formatting.FormattingUtils;
import pl.baczkowicz.spy.utils.ThreadingUtils;
import pl.baczkowicz.spy.utils.TimeUtils;

/**
 * Class responsible for updating control panel statistics.
 */
public class ControlPanelStatsUpdater implements Runnable
{
	/** Milliseconds since first stats recorded. */
	private final static long MILLISECONDS = new Date().getTime() - StatisticsManager.stats.getStartDate().toGregorianCalendar().getTime().getTime();
	
	/** Days since first stats recorded. */
	private final static long DAYS = MILLISECONDS / (1000 * 60 * 60 * 24);
	
	/** Text saying "in X days" or "" when only 1 day since first recorded stats. */
	private final static String IN_DAYS_PHRASE = DAYS > 1 ? (" in " + DAYS + " days") : "";
	
	/** Text saying "since XXXX-XX-XX", where the X is the date of first recorded stats. */
	private final static String SINCE_PHRASE = " since " + TimeUtils.DATE_SDF.format(StatisticsManager.stats.getStartDate().toGregorianCalendar().getTime());
	
	/** How many different stat messages there are. */
	private final static int STATS_MESSAGES = 6;
	
	/** How many intervals allow before going to next stats. */
	private final static int GO_NEXT_AFTER_INTERVALS = 10;
	
	/** The one second interval. */
	private final static int ONE_SECOND_INTERVAL =  1000;
		
	/** Flag indicating whether the stats are being played automatically (true) or have been paused (false). */
	private boolean statsPlaying;
	
	/** List of getting involved messages. */
	private List<String> gettingInvolvedDetails = new ArrayList<String>(Arrays.asList(
			"Finding mqtt-spy useful? Get involved and make mqtt-spy even better", 
			"Like your mqtt-spy? Get involved and see how you can help at", 
			"Using mqtt-spy on a regular basis? See how you can help the project at"));

	/** The controller of the stats control panel item. */
	private final ControlPanelItemController controlPanelItemController;

	/** Reference to the application itself. */
	private Application application;

	/** The button on which stats are displayed. */
	private final Button bigButton;

	/** Counts how many seconds lapsed. */
	private int secondCounter;
	
	/** The index of the current statistics message. */
	private int statMessageIndex;

	public ControlPanelStatsUpdater(final ControlPanelItemController controlPanelItemController, final Button bigButton, final Application application)
	{
		this.controlPanelItemController = controlPanelItemController;
		this.bigButton = bigButton;
		this.application = application;
	}	
	
	/**
	 * Displays the initial state of the statistics control panel item.
	 */
	public void show()
	{
		// Default values
		controlPanelItemController.setTitle("Connect to an MQTT broker to start seeing processing statistics...");		
		controlPanelItemController.setDetails("");
		controlPanelItemController.setStatus(ItemStatus.STATS);
		
		bigButton.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				moveToNextStatMessage();
			}
		});

		final List<Node> items  = new ArrayList<Node>();

		// Getting involved details
		final Random r = new Random();
		items.add(new Label(gettingInvolvedDetails.get(r.nextInt(gettingInvolvedDetails.size()))));

		final Hyperlink getInvolved = new Hyperlink();
		getInvolved.setText("http://github.com/kamilfb/mqtt-spy/wiki/Getting-involved");
		getInvolved.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				application.getHostServices().showDocument("http://github.com/kamilfb/mqtt-spy/wiki/Getting-involved");
			}
		});
		items.add(getInvolved);
		
		items.add(new Label(":)"));
		controlPanelItemController.getDetails().getChildren().addAll(items);
		
		statsPlaying = true;
		ControlPanelItemController.setButtonProperties(controlPanelItemController.getButton1(), "/images/small/pause.png", true, new EventHandler<ActionEvent>()
		{			
			@Override
			public void handle(ActionEvent event)
			{
				if (statsPlaying)
				{
					ControlPanelItemController.setButtonProperties(controlPanelItemController.getButton1(), "/images/small/play.png", true);
					statsPlaying = false;
				}
				else
				{
					ControlPanelItemController.setButtonProperties(controlPanelItemController.getButton1(), "/images/small/pause.png", true);
					statsPlaying = true;
				}
				event.consume();
			}
		});
		
		controlPanelItemController.refresh();
		
		new Thread(this).start();
	}
	
	/**
	 * Moves to the next statistics message.
	 */
	private void moveToNextStatMessage()
	{	
		secondCounter = 0;
		
		statMessageIndex++;
		
		if (statMessageIndex == STATS_MESSAGES)
		{
			statMessageIndex = 0;
		}
		
		// Try to update the stats - if all unavailable, ignore
		int retries = 0;		
		while (!refreshStatsMessage(false) && retries < STATS_MESSAGES)
		{				
			statMessageIndex++;
			
			if (statMessageIndex == STATS_MESSAGES)
			{
				statMessageIndex = 0;
			}
			
			retries++;
		}
	}
	
	/**
	 * Refreshes the stats message.
	 *  
	 * @param updateOnly Flag allowing some values to reach 0 and still be displayed
	 * 
	 * @return True if the stats message has been updated
	 */
	private boolean refreshStatsMessage(final boolean updateOnly)
	{
		if ((statMessageIndex == 0) && (StatisticsManager.stats.getConnections() > 0))
		{
			controlPanelItemController.setTitle(String.format(
					"Your mqtt-spy made %s connection" + (StatisticsManager.stats.getConnections() > 1 ? "s" : "") + " to MQTT brokers%s.",
					FormattingUtils.formatNumber(StatisticsManager.stats.getConnections()), IN_DAYS_PHRASE));
			return true;
		}

		else if ((statMessageIndex == 1) && (StatisticsManager.stats.getMessagesPublished() > 1))
		{
			controlPanelItemController.setTitle(String.format(
					"Your mqtt-spy published %s messages to MQTT brokers.",
					FormattingUtils.formatNumber(StatisticsManager.stats.getMessagesPublished()), IN_DAYS_PHRASE));
			return true;
		}

		else if ((statMessageIndex == 2) && (StatisticsManager.stats.getSubscriptions() > 1))
		{
			controlPanelItemController.setTitle(String.format(
					"Your mqtt-spy made %s subscriptions to MQTT brokers%s.",
					FormattingUtils.formatNumber(StatisticsManager.stats.getSubscriptions()), IN_DAYS_PHRASE));
			return true;
		}

		else if ((statMessageIndex == 3) && (StatisticsManager.stats.getMessagesReceived() > 1))
		{
			controlPanelItemController.setTitle(String.format(
					"Your mqtt-spy received %s messages%s.",
					FormattingUtils.formatNumber(StatisticsManager.stats.getMessagesReceived()), SINCE_PHRASE));
			return true;
		}

		else if ((statMessageIndex == 4) && (updateOnly || StatisticsManager.getMessagesPublished() > 1))
		{
			controlPanelItemController.setTitle(String.format(
					"Right now your mqtt-spy is publishing %s msgs/s.",
					StatisticsManager.getMessagesPublished()));
			return true;
		}

		else if ((statMessageIndex == 5) && (updateOnly || StatisticsManager.getMessagesReceived() > 1))
		{
			controlPanelItemController.setTitle(String.format(
					"Right now your mqtt-spy is munching through %d msgs/s.",
					StatisticsManager.getMessagesReceived()));
			return true;
		}				
		
		return false;
	}

	@Override
	public void run()
	{
		ThreadingUtils.logThreadStarting("Control Panel Stats Updater");
		
		secondCounter = 0;
		while (true)
		{
			secondCounter++;
			oneCycleRefresh();
			oneCycleMoveToNext();					
			
			if (ThreadingUtils.sleep(ONE_SECOND_INTERVAL))
			{
				break;
			}			
		}
		
		ThreadingUtils.logThreadEnding();
	}
	
	/**
	 * Refreshes currently displayed information.
	 */
	private void oneCycleRefresh()	
	{
		Platform.runLater(new Runnable()
		{				
			@Override
			public void run()
			{
				refreshStatsMessage(true);	
			}
		});
	}
	
	/**
	 * When due, moves to the next stats message.
	 */
	private void oneCycleMoveToNext()
	{
		if (statsPlaying)
		{
			if (secondCounter == GO_NEXT_AFTER_INTERVALS)
			{
				secondCounter = 0;
				Platform.runLater(new Runnable()
				{						
					@Override
					public void run()
					{
						moveToNextStatMessage();							
					}
				});
			}				
		}
		else
		{
			secondCounter = 0;
		}		
	}
}
