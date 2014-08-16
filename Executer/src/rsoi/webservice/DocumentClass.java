
package rsoi.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classDoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="docs" type="{http://WebService.rsoi/}stateProgDoc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentClass", propOrder = {
    "caption",
    "classDoc",
    "docs",
    "id"
})
public class DocumentClass {

    protected String caption;
    protected int classDoc;
    @XmlElement(nillable = true)
    protected List<StateProgDoc> docs;
    protected int id;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the classDoc property.
     * 
     */
    public int getClassDoc() {
        return classDoc;
    }

    /**
     * Sets the value of the classDoc property.
     * 
     */
    public void setClassDoc(int value) {
        this.classDoc = value;
    }

    /**
     * Gets the value of the docs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateProgDoc }
     * 
     * 
     */
    public List<StateProgDoc> getDocs() {
        if (docs == null) {
            docs = new ArrayList<StateProgDoc>();
        }
        return this.docs;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
