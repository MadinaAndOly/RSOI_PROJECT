
package rsoi.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createSubProgramm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createSubProgramm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://model.rsoi/}stateProgDoc" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://model.rsoi/}stateProgDoc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createSubProgramm", propOrder = {
    "arg0",
    "arg1"
})
public class CreateSubProgramm {

    protected StateProgDoc arg0;
    protected StateProgDoc arg1;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link StateProgDoc }
     *     
     */
    public StateProgDoc getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProgDoc }
     *     
     */
    public void setArg0(StateProgDoc value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     * @return
     *     possible object is
     *     {@link StateProgDoc }
     *     
     */
    public StateProgDoc getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProgDoc }
     *     
     */
    public void setArg1(StateProgDoc value) {
        this.arg1 = value;
    }

}
