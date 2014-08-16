
package rsoi.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createDoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://WebService.rsoi/}stateProgDoc" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://WebService.rsoi/}documentClass" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createDoc", propOrder = {
    "arg0",
    "arg1"
})
public class CreateDoc {

    protected StateProgDoc arg0;
    protected DocumentClass arg1;

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
     *     {@link DocumentClass }
     *     
     */
    public DocumentClass getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentClass }
     *     
     */
    public void setArg1(DocumentClass value) {
        this.arg1 = value;
    }

}
