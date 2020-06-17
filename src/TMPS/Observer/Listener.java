package TMPS.Observer;

public class Listener implements Observer {
    @Override
    public void HandleEvent(String e) {
        System.out.println("Handling event: " + e);
    }
}
