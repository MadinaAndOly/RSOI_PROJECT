package rsoi.DataObject;

/**
 * Created by madina on 12.05.14.
 */
public class StateProgDocChildren {
    public StateProgDoc slave;
    public StateProgDoc master;
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSlave(StateProgDoc slave) {
        this.slave = slave;
    }

    public void setMaster(StateProgDoc master) {
        this.master = master;
    }

    public StateProgDoc getSlave() {
        return slave;
    }

    public StateProgDoc getMaster() {
        return master;
    }
}
