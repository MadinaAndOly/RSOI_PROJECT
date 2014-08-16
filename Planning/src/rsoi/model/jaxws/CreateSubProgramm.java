
package rsoi.model.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createSubProgramm", namespace = "http://model.rsoi/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createSubProgramm", namespace = "http://model.rsoi/", propOrder = {
    "arg0",
    "arg1"
})
public class CreateSubProgramm {

    @XmlElement(name = "arg0", namespace = "")
    private rsoi.DataObject.StateProgDoc arg0;
    @XmlElement(name = "arg1", namespace = "")
    private rsoi.DataObject.StateProgDoc arg1;

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

    /**
     * 
     * @return
     *     returns StateProgDoc
     */
    public rsoi.DataObject.StateProgDoc getArg1() {
        return this.arg1;
    }

    /**
     * 
     * @param arg1
     *     the value for the arg1 property
     */
    public void setArg1(rsoi.DataObject.StateProgDoc arg1) {
        this.arg1 = arg1;
    }

}
