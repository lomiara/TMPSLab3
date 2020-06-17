package TMPS.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Snapshot> history = new ArrayList<>();

    public void takeSnapshot(Snapshot snapshot){
        history.add(snapshot);
    }

    public void restore(){
        if(history.size()!=0) {
            history.get(history.size()-1).restore();
            history.remove(history.size()-1);
        }
    }

}
