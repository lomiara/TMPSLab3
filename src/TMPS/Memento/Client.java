package TMPS.Memento;

public class Client {
    public void example(){
        System.out.println("Memento");
        Model model = new Model();
        CareTaker careTaker = new CareTaker();
        model.setState("state 1");
        careTaker.takeSnapshot(model.createSnapshot());
        model.setState("state 2");
        careTaker.takeSnapshot(model.createSnapshot());
        model.setState("state 3");
        careTaker.takeSnapshot(model.createSnapshot());
        model.setState("state 4");
        careTaker.takeSnapshot(model.createSnapshot());
        model.setState("state 5");
        System.out.println(model.getState());
        careTaker.restore();
        System.out.println(model.getState());
        careTaker.restore();
        System.out.println(model.getState());
        System.out.println();
    }
}
