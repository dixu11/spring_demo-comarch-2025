package szlicht.daniel.spring_demo.beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleController implements CommandLineRunner { //CLR - rozwiązanie - jak uruchomić na Spring program ze sterowaniem z konsoli
    private Game game ;
    private Scanner scanner;

    public ConsoleController(Game game, Scanner scanner) {
        this.game = game;
        this.scanner = scanner;
    }

  //  @PostConstruct - uruchamia po stworzeniu Beana
    public void startGame() {
        System.out.println("Starting program");
        String firstDialog = game.getFirstDialog();
        System.out.println(firstDialog);
        //Scanner scanner = new Scanner(System.in);
//        System.out.println("Wybierz odpowiedź:");
//        String odpowiedz = scanner.nextLine();
//        System.out.println(odpowiedz);
    }


    @Override
    public void run(String... args) throws Exception {
        startGame();
    }
}
