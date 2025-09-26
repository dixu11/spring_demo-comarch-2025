package szlicht.daniel.spring_demo;

import org.springframework.stereotype.Component;

@Component("memory")
public class NpcMemoryRepository implements NpcRepository{


    public NpcMemoryRepository(){
        System.out.println("Powstało NpcMemoryRepository");
    }

    public Npc readNpc() {
        System.out.println("creating object");
        return new Npc("Mariusz", "Siema");
    }
}
