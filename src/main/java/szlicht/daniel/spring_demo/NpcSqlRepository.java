package szlicht.daniel.spring_demo;

public class NpcSqlRepository implements  NpcRepository{

    public Npc readNpc() {
        System.out.println("reading sql");
        return new Npc("Dawid", "Cześć");
    }
}
