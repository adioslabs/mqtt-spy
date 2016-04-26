//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.25 at 10:44:15 PM BST 
//


package pl.baczkowicz.mqttspy.daemon.configuration.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import pl.baczkowicz.mqttspy.common.generated.MessageLog;
import pl.baczkowicz.mqttspy.common.generated.MqttConnectionDetails;
import pl.baczkowicz.mqttspy.common.generated.SubscriptionDetails;
import pl.baczkowicz.spy.common.generated.RunningMode;
import pl.baczkowicz.spy.common.generated.ScriptDetails;
import pl.baczkowicz.spy.common.generated.TestCasesSettings;


/**
 * <p>Java class for DaemonMqttConnectionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DaemonMqttConnectionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://baczkowicz.pl/mqtt-spy/common}MqttConnectionDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Formatter" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="MessageLog" type="{http://baczkowicz.pl/mqtt-spy/common}MessageLog"/&gt;
 *         &lt;element name="Subscription" type="{http://baczkowicz.pl/mqtt-spy/common}SubscriptionDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BackgroundScript" type="{http://baczkowicz.pl/spy/common}ScriptDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TestCases" type="{http://baczkowicz.pl/spy/common}TestCasesSettings" minOccurs="0"/&gt;
 *         &lt;element name="RunningMode" type="{http://baczkowicz.pl/spy/common}RunningMode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaemonMqttConnectionDetails", propOrder = {
    "formatter",
    "messageLog",
    "subscription",
    "backgroundScript",
    "testCases",
    "runningMode"
})
public class DaemonMqttConnectionDetails
    extends MqttConnectionDetails
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Formatter")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object formatter;
    @XmlElement(name = "MessageLog", required = true)
    protected MessageLog messageLog;
    @XmlElement(name = "Subscription")
    protected List<SubscriptionDetails> subscription;
    @XmlElement(name = "BackgroundScript")
    protected List<ScriptDetails> backgroundScript;
    @XmlElement(name = "TestCases")
    protected TestCasesSettings testCases;
    @XmlElement(name = "RunningMode")
    @XmlSchemaType(name = "string")
    protected RunningMode runningMode;

    /**
     * Gets the value of the formatter property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFormatter() {
        return formatter;
    }

    /**
     * Sets the value of the formatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFormatter(Object value) {
        this.formatter = value;
    }

    /**
     * Gets the value of the messageLog property.
     * 
     * @return
     *     possible object is
     *     {@link MessageLog }
     *     
     */
    public MessageLog getMessageLog() {
        return messageLog;
    }

    /**
     * Sets the value of the messageLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageLog }
     *     
     */
    public void setMessageLog(MessageLog value) {
        this.messageLog = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionDetails }
     * 
     * 
     */
    public List<SubscriptionDetails> getSubscription() {
        if (subscription == null) {
            subscription = new ArrayList<SubscriptionDetails>();
        }
        return this.subscription;
    }

    /**
     * Gets the value of the backgroundScript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backgroundScript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackgroundScript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScriptDetails }
     * 
     * 
     */
    public List<ScriptDetails> getBackgroundScript() {
        if (backgroundScript == null) {
            backgroundScript = new ArrayList<ScriptDetails>();
        }
        return this.backgroundScript;
    }

    /**
     * Gets the value of the testCases property.
     * 
     * @return
     *     possible object is
     *     {@link TestCasesSettings }
     *     
     */
    public TestCasesSettings getTestCases() {
        return testCases;
    }

    /**
     * Sets the value of the testCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestCasesSettings }
     *     
     */
    public void setTestCases(TestCasesSettings value) {
        this.testCases = value;
    }

    /**
     * Gets the value of the runningMode property.
     * 
     * @return
     *     possible object is
     *     {@link RunningMode }
     *     
     */
    public RunningMode getRunningMode() {
        return runningMode;
    }

    /**
     * Sets the value of the runningMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunningMode }
     *     
     */
    public void setRunningMode(RunningMode value) {
        this.runningMode = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            Object theFormatter;
            theFormatter = this.getFormatter();
            strategy.appendField(locator, this, "formatter", buffer, theFormatter);
        }
        {
            MessageLog theMessageLog;
            theMessageLog = this.getMessageLog();
            strategy.appendField(locator, this, "messageLog", buffer, theMessageLog);
        }
        {
            List<SubscriptionDetails> theSubscription;
            theSubscription = (((this.subscription!= null)&&(!this.subscription.isEmpty()))?this.getSubscription():null);
            strategy.appendField(locator, this, "subscription", buffer, theSubscription);
        }
        {
            List<ScriptDetails> theBackgroundScript;
            theBackgroundScript = (((this.backgroundScript!= null)&&(!this.backgroundScript.isEmpty()))?this.getBackgroundScript():null);
            strategy.appendField(locator, this, "backgroundScript", buffer, theBackgroundScript);
        }
        {
            TestCasesSettings theTestCases;
            theTestCases = this.getTestCases();
            strategy.appendField(locator, this, "testCases", buffer, theTestCases);
        }
        {
            RunningMode theRunningMode;
            theRunningMode = this.getRunningMode();
            strategy.appendField(locator, this, "runningMode", buffer, theRunningMode);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DaemonMqttConnectionDetails)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DaemonMqttConnectionDetails that = ((DaemonMqttConnectionDetails) object);
        {
            Object lhsFormatter;
            lhsFormatter = this.getFormatter();
            Object rhsFormatter;
            rhsFormatter = that.getFormatter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formatter", lhsFormatter), LocatorUtils.property(thatLocator, "formatter", rhsFormatter), lhsFormatter, rhsFormatter)) {
                return false;
            }
        }
        {
            MessageLog lhsMessageLog;
            lhsMessageLog = this.getMessageLog();
            MessageLog rhsMessageLog;
            rhsMessageLog = that.getMessageLog();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageLog", lhsMessageLog), LocatorUtils.property(thatLocator, "messageLog", rhsMessageLog), lhsMessageLog, rhsMessageLog)) {
                return false;
            }
        }
        {
            List<SubscriptionDetails> lhsSubscription;
            lhsSubscription = (((this.subscription!= null)&&(!this.subscription.isEmpty()))?this.getSubscription():null);
            List<SubscriptionDetails> rhsSubscription;
            rhsSubscription = (((that.subscription!= null)&&(!that.subscription.isEmpty()))?that.getSubscription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscription", lhsSubscription), LocatorUtils.property(thatLocator, "subscription", rhsSubscription), lhsSubscription, rhsSubscription)) {
                return false;
            }
        }
        {
            List<ScriptDetails> lhsBackgroundScript;
            lhsBackgroundScript = (((this.backgroundScript!= null)&&(!this.backgroundScript.isEmpty()))?this.getBackgroundScript():null);
            List<ScriptDetails> rhsBackgroundScript;
            rhsBackgroundScript = (((that.backgroundScript!= null)&&(!that.backgroundScript.isEmpty()))?that.getBackgroundScript():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "backgroundScript", lhsBackgroundScript), LocatorUtils.property(thatLocator, "backgroundScript", rhsBackgroundScript), lhsBackgroundScript, rhsBackgroundScript)) {
                return false;
            }
        }
        {
            TestCasesSettings lhsTestCases;
            lhsTestCases = this.getTestCases();
            TestCasesSettings rhsTestCases;
            rhsTestCases = that.getTestCases();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testCases", lhsTestCases), LocatorUtils.property(thatLocator, "testCases", rhsTestCases), lhsTestCases, rhsTestCases)) {
                return false;
            }
        }
        {
            RunningMode lhsRunningMode;
            lhsRunningMode = this.getRunningMode();
            RunningMode rhsRunningMode;
            rhsRunningMode = that.getRunningMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "runningMode", lhsRunningMode), LocatorUtils.property(thatLocator, "runningMode", rhsRunningMode), lhsRunningMode, rhsRunningMode)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Object theFormatter;
            theFormatter = this.getFormatter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formatter", theFormatter), currentHashCode, theFormatter);
        }
        {
            MessageLog theMessageLog;
            theMessageLog = this.getMessageLog();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageLog", theMessageLog), currentHashCode, theMessageLog);
        }
        {
            List<SubscriptionDetails> theSubscription;
            theSubscription = (((this.subscription!= null)&&(!this.subscription.isEmpty()))?this.getSubscription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscription", theSubscription), currentHashCode, theSubscription);
        }
        {
            List<ScriptDetails> theBackgroundScript;
            theBackgroundScript = (((this.backgroundScript!= null)&&(!this.backgroundScript.isEmpty()))?this.getBackgroundScript():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "backgroundScript", theBackgroundScript), currentHashCode, theBackgroundScript);
        }
        {
            TestCasesSettings theTestCases;
            theTestCases = this.getTestCases();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testCases", theTestCases), currentHashCode, theTestCases);
        }
        {
            RunningMode theRunningMode;
            theRunningMode = this.getRunningMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "runningMode", theRunningMode), currentHashCode, theRunningMode);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
