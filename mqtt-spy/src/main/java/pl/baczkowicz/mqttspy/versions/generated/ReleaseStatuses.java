//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.14 at 01:24:28 PM BST 
//


package pl.baczkowicz.mqttspy.versions.generated;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for ReleaseStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReleaseStatuses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReleaseStatus" type="{http://baczkowicz.pl/mqtt-spy-versions}ReleaseStatus" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReleaseStatuses", propOrder = {
    "releaseStatus"
})
public class ReleaseStatuses
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "ReleaseStatus", required = true)
    protected List<ReleaseStatus> releaseStatus;

    /**
     * Gets the value of the releaseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the releaseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReleaseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReleaseStatus }
     * 
     * 
     */
    public List<ReleaseStatus> getReleaseStatus() {
        if (releaseStatus == null) {
            releaseStatus = new ArrayList<ReleaseStatus>();
        }
        return this.releaseStatus;
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
            List<ReleaseStatus> theReleaseStatus;
            theReleaseStatus = (((this.releaseStatus!= null)&&(!this.releaseStatus.isEmpty()))?this.getReleaseStatus():null);
            strategy.appendField(locator, this, "releaseStatus", buffer, theReleaseStatus);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ReleaseStatuses)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReleaseStatuses that = ((ReleaseStatuses) object);
        {
            List<ReleaseStatus> lhsReleaseStatus;
            lhsReleaseStatus = (((this.releaseStatus!= null)&&(!this.releaseStatus.isEmpty()))?this.getReleaseStatus():null);
            List<ReleaseStatus> rhsReleaseStatus;
            rhsReleaseStatus = (((that.releaseStatus!= null)&&(!that.releaseStatus.isEmpty()))?that.getReleaseStatus():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "releaseStatus", lhsReleaseStatus), LocatorUtils.property(thatLocator, "releaseStatus", rhsReleaseStatus), lhsReleaseStatus, rhsReleaseStatus)) {
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
            List<ReleaseStatus> theReleaseStatus;
            theReleaseStatus = (((this.releaseStatus!= null)&&(!this.releaseStatus.isEmpty()))?this.getReleaseStatus():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "releaseStatus", theReleaseStatus), currentHashCode, theReleaseStatus);
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
        if (draftCopy instanceof ReleaseStatuses) {
            final ReleaseStatuses copy = ((ReleaseStatuses) draftCopy);
            if ((this.releaseStatus!= null)&&(!this.releaseStatus.isEmpty())) {
                List<ReleaseStatus> sourceReleaseStatus;
                sourceReleaseStatus = (((this.releaseStatus!= null)&&(!this.releaseStatus.isEmpty()))?this.getReleaseStatus():null);
                @SuppressWarnings("unchecked")
                List<ReleaseStatus> copyReleaseStatus = ((List<ReleaseStatus> ) strategy.copy(LocatorUtils.property(locator, "releaseStatus", sourceReleaseStatus), sourceReleaseStatus));
                copy.releaseStatus = null;
                if (copyReleaseStatus!= null) {
                    List<ReleaseStatus> uniqueReleaseStatusl = copy.getReleaseStatus();
                    uniqueReleaseStatusl.addAll(copyReleaseStatus);
                }
            } else {
                copy.releaseStatus = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ReleaseStatuses();
    }

}
