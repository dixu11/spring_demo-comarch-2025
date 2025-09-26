package szlicht.daniel.spring_demo;

public class NpcMemoryRepository implements NpcRepository{

    public Npc readNpc() {
        System.out.println("creating object");
        return new Npc("Mariusz", "Siema");
    }
}
