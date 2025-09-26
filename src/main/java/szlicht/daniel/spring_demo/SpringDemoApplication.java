package szlicht.daniel.spring_demo;

//SOLID
//@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringDemoApplication.class, args);
        NpcMemoryRepository npcMemoryRepository = new NpcMemoryRepository();
        NpcSqlRepository sqlRepository = new NpcSqlRepository();
        Game game = new Game(sqlRepository);
        ConsoleController controller = new ConsoleController(game);
        controller.startGame();
	}

}
