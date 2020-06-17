package TMPS.Template;

public class Client {
    public void example(){
        System.out.println("Template");
        Game game = new Baseball();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
        System.out.println();
    }
}
