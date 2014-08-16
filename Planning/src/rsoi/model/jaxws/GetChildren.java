
package rsoi.model.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getChildren", namespace = "http://model.rsoi/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChildren", namespace = "http://model.rsoi/")
public class GetChildren {

    @XmlElement(name = "arg0", namespace = "")
    private rsoi.DataObject.StateProgDoc arg0;

    /**
     * 
     * @return
     *     returns StateProgDoc
     */
    public rsoi.DataObject.StateProgDoc getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(rsoi.DataObject.StateProgDoc arg0) {
        this.arg0 = arg0;
    }

}
