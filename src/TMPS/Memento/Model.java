package TMPS.Memento;

public class Model {

    private String state = "";

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Snapshot createSnapshot(){
        return new Snapshot(this,state);
    }
}
