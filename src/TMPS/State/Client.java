package TMPS.State;

public class Client {
    public void example(){
        System.out.println("State");
        StateContext context = new StateContext();
        context.heat();
        context.heat();
        context.heat();
        context.freeze();
        context.freeze();
        context.freeze();
        System.out.println();
    }
}
