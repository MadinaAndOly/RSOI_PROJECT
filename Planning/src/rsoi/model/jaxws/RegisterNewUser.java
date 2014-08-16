
package rsoi.model.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "registerNewUser", namespace = "http://model.rsoi/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerNewUser", namespace = "http://model.rsoi/")
public class RegisterNewUser {

    @XmlElement(name = "arg0", namespace = "")
    private rsoi.DataObject.User arg0;

    /**
     * 
     * @return
     *     returns User
     */
    public rsoi.DataObject.User getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(rsoi.DataObject.User arg0) {
        this.arg0 = arg0;
    }

}
