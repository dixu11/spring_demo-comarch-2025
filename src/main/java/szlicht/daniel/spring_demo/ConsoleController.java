package szlicht.daniel.spring_demo;

public class ConsoleController {
    private Game game ;

    public ConsoleController(Game game) {
        this.game = game;
    }

    public void startGame() {
        System.out.println("Starting program");
        String firstDialog = game.getFirstDialog();
        System.out.println(firstDialog);
    }

}
