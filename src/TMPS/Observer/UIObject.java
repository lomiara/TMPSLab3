package TMPS.Observer;

import java.util.LinkedList;
import java.util.List;

public class UIObject implements Observable {

    private String event;
    private List<Observer> observers = new LinkedList<>();

    public void MouseEvent(){
        event = "Mouse was clicked";
        Notify();
    }

    public void KeyEvent(){
        event = "Key was typed";
        Notify();
    }

    @Override
    public void AddObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void RemoveObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void Notify() {
        for(Observer o:observers) {
            o.HandleEvent(event);
        }
    }
}
