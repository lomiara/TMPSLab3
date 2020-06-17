package TMPS.Memento;


public class Snapshot {

    private Model model;
    private final String state;

    public Snapshot(Model model, String state) {
        this.model = model;
        this.state = state;
    }

    public void restore() {
        model.setState(state);
    }
}