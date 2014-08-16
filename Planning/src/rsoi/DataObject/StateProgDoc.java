package rsoi.DataObject;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/**
 * Created by madina on 11.05.14.
 */
public class StateProgDoc implements Serializable{
    private int id;
    private BigInteger numberDoc;
    private Date dateDoc;
    private Date dateApprove;
    private String caption;
    private Date dateStart;
    private Date dateEnd;
    private Org executor;
    private DocumentClass documentClass;
    private StateProgDoc parent;
    private String comment;
    private int state;
    private List<StateProgDoc> children;

    public void setChildren(List<StateProgDoc> children) {
        this.children = children;
    }

    public List<StateProgDoc> getChildren() {

        return children;
    }

    public StateProgDoc(){

    }
    public StateProgDoc(BigInteger numberDoc, Date dateDoc, Date dateApprove, Date dateStart,
                        Date dateEnd, String caption, Org executor,DocumentClass documentClass, StateProgDoc parent, String comment, int state){
        this.numberDoc = numberDoc;
        this.dateDoc = dateDoc;
        this.dateApprove = dateApprove;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.caption = caption;
        this.executor = executor;
        this.documentClass = documentClass;
        this.parent = parent;
        this.comment = comment;
        this.state = state;
    }

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

    public void setDateApprove(Date dateApprove) {
        this.dateApprove = dateApprove;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setExecutor(Org executor) {
        this.executor = executor;
    }

    public void setDocumentClass(DocumentClass documentClass) {
        this.documentClass = documentClass;
    }

    public void setParent(StateProgDoc parent) {
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

    public Date getDateApprove() {
        return dateApprove;
    }

    public String getCaption() {
        return caption;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public Org getExecutor() {
        return executor;
    }

    public DocumentClass getDocumentClass() {
        return documentClass;
    }

    public StateProgDoc getParent() {
        return parent;
    }

    public String getComment() {
        return comment;
    }
}
