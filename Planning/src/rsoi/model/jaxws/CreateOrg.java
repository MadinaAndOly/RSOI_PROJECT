
package rsoi.model.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createOrg", namespace = "http://model.rsoi/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createOrg", namespace = "http://model.rsoi/")
public class CreateOrg {

    @XmlElement(name = "arg0", namespace = "")
    private rsoi.DataObject.Org arg0;

    /**
     * 
     * @return
     *     returns Org
     */
    public rsoi.DataObject.Org getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(rsoi.DataObject.Org arg0) {
        this.arg0 = arg0;
    }

}
