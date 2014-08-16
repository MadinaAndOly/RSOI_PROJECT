package rsoi.DataObject;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by madina on 11.05.14.
 */
public class Org implements Serializable {

    private int id;
    private String INN;
    private String caption;
    private String code;
    private Set<StateProgDoc> docs;

    public void setDocs(Set<StateProgDoc> docs) {
        this.docs = docs;
    }

    public Set<StateProgDoc> getDocs() {

        return docs;
    }

    public Org(){

    }
    public Org(String INN, String caption, String code){
        this.caption = caption;
        this.code = code;
        this.INN = INN;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setINN(String INN) {
        this.INN = INN;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getINN() {
        return INN;
    }

    public String getCaption() {
        return caption;
    }

    public String getCode() {
        return code;
    }
}
