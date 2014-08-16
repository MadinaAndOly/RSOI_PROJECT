package rsoiExc.DataObject;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by madina on 11.05.14.
 */
public class Programms  implements Serializable{
    private int id;
    private BigInteger numberDoc;
    private Date dateDoc;
    private GregorianCalendar dateApprove;
    private String caption;
    private GregorianCalendar dateStart;
    private GregorianCalendar dateEnd;
    private int documentClass;
    private Programms parent;
    private String comment;
    private int state;

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNumberDoc(BigInteger numberDoc) {
        this.numberDoc = numberDoc;
    }

    public void setDateDoc(Date dateDoc) {
        this.dateDoc = dateDoc;
    }

    public void setDateApprove(GregorianCalendar dateApprove) {
        this.dateApprove = dateApprove;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setDateStart(GregorianCalendar dateStart) {
        this.dateStart = dateStart;
    }

    public void setDateEnd(GregorianCalendar dateEnd) {
        this.dateEnd = dateEnd;
    }


    public void setDocumentClass(int documentClass) {
        this.documentClass = documentClass;
    }

    public void setParent(Programms parent) {
        this.parent = parent;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BigInteger getNumberDoc() {
        return numberDoc;
    }

    public Date getDateDoc() {
        return dateDoc;
    }

    public GregorianCalendar getDateApprove() {
        return dateApprove;
    }

    public String getCaption() {
        return caption;
    }

    public GregorianCalendar getDateStart() {
        return dateStart;
    }

    public GregorianCalendar getDateEnd() {
        return dateEnd;
    }

    public int getDocumentClass() {
        return documentClass;
    }

    public Programms getParent() {
        return parent;
    }

    public String getComment() {
        return comment;
    }
}