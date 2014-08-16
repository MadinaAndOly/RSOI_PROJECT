package rsoi.DataObject;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by madina on 11.05.14.
 */
public class DocumentClass implements Serializable{
    private int id;
    private int classDoc;
    private String caption;
    private Set<StateProgDoc> docs;

    public void setDocs(Set<StateProgDoc> docs) {
        this.docs = docs;
    }

    public Set<StateProgDoc> getDocs() {

        return docs;
    }

    public DocumentClass(){

    }


    public DocumentClass(int classDoc, String caption){
        this.caption = caption;
        this.classDoc = classDoc;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {

        return id;
    }

    public void setClassDoc(int classDoc) {
        this.classDoc = classDoc;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getClassDoc() {
        return classDoc;
    }

    public String getCaption() {
        return caption;
    }
}
