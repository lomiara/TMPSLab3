package TMPS.Observer;

public class Client {
    public void example(){
        System.out.println("Observer");
        UIObject TextField = new UIObject();
        Listener EventListener = new Listener();
        TextField.AddObserver(EventListener);
        TextField.MouseEvent();
        TextField.KeyEvent();
        System.out.println();
    }
}
