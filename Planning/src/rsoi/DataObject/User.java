package rsoi.DataObject;

import javax.jws.soap.SOAPBinding;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by madina on 05.06.14.
 */
public class User implements Serializable {
    private String guid;
    private String login;
    private String pwd;
    private String name;
    private String lname;
    private String mname;
    private Date last_update;
    private int id;

    public User(String guid, String login, String pwd, String name, String lname, String mname){
        this.guid = guid; this.login = login; this.pwd = pwd; this.name = name;
        this.lname = lname; this.mname = mname;
    }

    public User(){

    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {

        return id;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public Date getLast_update() {

        return last_update;
    }

    public String getGuid() {
        return guid;
    }

    public String getLogin() {
        return login;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public String getMname() {
        return mname;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }



}
