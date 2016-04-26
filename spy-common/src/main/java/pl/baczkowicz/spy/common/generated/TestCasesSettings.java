//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.26 at 04:46:16 PM BST 
//


package pl.baczkowicz.spy.common.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for TestCasesSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestCasesSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExportResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StepInterval" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RecordRepeatedSteps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestCasesSettings", propOrder = {
    "location",
    "exportResults",
    "stepInterval",
    "recordRepeatedSteps"
})
public class TestCasesSettings implements Serializable, Cloneable, CopyTo, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Location", required = true)
    protected String location;
    @XmlElement(name = "ExportResults")
    protected boolean exportResults;
    @XmlElement(name = "StepInterval")
    protected Long stepInterval;
    @XmlElement(name = "RecordRepeatedSteps")
    protected Boolean recordRepeatedSteps;

    /**
     * Default no-arg constructor
     * 
     */
    public TestCasesSettings() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TestCasesSettings(final String location, final boolean exportResults, final Long stepInterval, final Boolean recordRepeatedSteps) {
        this.location = location;
        this.exportResults = exportResults;
        this.stepInterval = stepInterval;
        this.recordRepeatedSteps = recordRepeatedSteps;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the exportResults property.
     * 
     */
    public boolean isExportResults() {
        return exportResults;
    }

    /**
     * Sets the value of the exportResults property.
     * 
     */
    public void setExportResults(boolean value) {
        this.exportResults = value;
    }

    /**
     * Gets the value of the stepInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStepInterval() {
        return stepInterval;
    }

    /**
     * Sets the value of the stepInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStepInterval(Long value) {
        this.stepInterval = value;
    }

    /**
     * Gets the value of the recordRepeatedSteps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordRepeatedSteps() {
        return recordRepeatedSteps;
    }

    /**
     * Sets the value of the recordRepeatedSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordRepeatedSteps(Boolean value) {
        this.recordRepeatedSteps = value;
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
        {
            String theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        {
            boolean theExportResults;
            theExportResults = this.isExportResults();
            strategy.appendField(locator, this, "exportResults", buffer, theExportResults);
        }
        {
            Long theStepInterval;
            theStepInterval = this.getStepInterval();
            strategy.appendField(locator, this, "stepInterval", buffer, theStepInterval);
        }
        {
            Boolean theRecordRepeatedSteps;
            theRecordRepeatedSteps = this.isRecordRepeatedSteps();
            strategy.appendField(locator, this, "recordRepeatedSteps", buffer, theRecordRepeatedSteps);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TestCasesSettings)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TestCasesSettings that = ((TestCasesSettings) object);
        {
            String lhsLocation;
            lhsLocation = this.getLocation();
            String rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
                return false;
            }
        }
        {
            boolean lhsExportResults;
            lhsExportResults = this.isExportResults();
            boolean rhsExportResults;
            rhsExportResults = that.isExportResults();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exportResults", lhsExportResults), LocatorUtils.property(thatLocator, "exportResults", rhsExportResults), lhsExportResults, rhsExportResults)) {
                return false;
            }
        }
        {
            Long lhsStepInterval;
            lhsStepInterval = this.getStepInterval();
            Long rhsStepInterval;
            rhsStepInterval = that.getStepInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stepInterval", lhsStepInterval), LocatorUtils.property(thatLocator, "stepInterval", rhsStepInterval), lhsStepInterval, rhsStepInterval)) {
                return false;
            }
        }
        {
            Boolean lhsRecordRepeatedSteps;
            lhsRecordRepeatedSteps = this.isRecordRepeatedSteps();
            Boolean rhsRecordRepeatedSteps;
            rhsRecordRepeatedSteps = that.isRecordRepeatedSteps();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordRepeatedSteps", lhsRecordRepeatedSteps), LocatorUtils.property(thatLocator, "recordRepeatedSteps", rhsRecordRepeatedSteps), lhsRecordRepeatedSteps, rhsRecordRepeatedSteps)) {
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
        int currentHashCode = 1;
        {
            String theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation);
        }
        {
            boolean theExportResults;
            theExportResults = this.isExportResults();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exportResults", theExportResults), currentHashCode, theExportResults);
        }
        {
            Long theStepInterval;
            theStepInterval = this.getStepInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stepInterval", theStepInterval), currentHashCode, theStepInterval);
        }
        {
            Boolean theRecordRepeatedSteps;
            theRecordRepeatedSteps = this.isRecordRepeatedSteps();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recordRepeatedSteps", theRecordRepeatedSteps), currentHashCode, theRecordRepeatedSteps);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof TestCasesSettings) {
            final TestCasesSettings copy = ((TestCasesSettings) draftCopy);
            if (this.location!= null) {
                String sourceLocation;
                sourceLocation = this.getLocation();
                String copyLocation = ((String) strategy.copy(LocatorUtils.property(locator, "location", sourceLocation), sourceLocation));
                copy.setLocation(copyLocation);
            } else {
                copy.location = null;
            }
            {
                boolean sourceExportResults;
                sourceExportResults = this.isExportResults();
                boolean copyExportResults = strategy.copy(LocatorUtils.property(locator, "exportResults", sourceExportResults), sourceExportResults);
                copy.setExportResults(copyExportResults);
            }
            if (this.stepInterval!= null) {
                Long sourceStepInterval;
                sourceStepInterval = this.getStepInterval();
                Long copyStepInterval = ((Long) strategy.copy(LocatorUtils.property(locator, "stepInterval", sourceStepInterval), sourceStepInterval));
                copy.setStepInterval(copyStepInterval);
            } else {
                copy.stepInterval = null;
            }
            if (this.recordRepeatedSteps!= null) {
                Boolean sourceRecordRepeatedSteps;
                sourceRecordRepeatedSteps = this.isRecordRepeatedSteps();
                Boolean copyRecordRepeatedSteps = ((Boolean) strategy.copy(LocatorUtils.property(locator, "recordRepeatedSteps", sourceRecordRepeatedSteps), sourceRecordRepeatedSteps));
                copy.setRecordRepeatedSteps(copyRecordRepeatedSteps);
            } else {
                copy.recordRepeatedSteps = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TestCasesSettings();
    }

}
