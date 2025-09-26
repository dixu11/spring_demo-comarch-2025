package szlicht.daniel.spring_demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Game {

    private NpcRepository npcRepository;


    public Game(@Qualifier("memory") NpcRepository npcRepository) {
        System.out.println("Tworzę Game które wymagało NpcRepository");
        this.npcRepository = npcRepository;
    }

    public String getFirstDialog() {
        Npc npc = npcRepository.readNpc();
        return String.format("%s: %s.", npc.getName(), npc.getGreeting());
    }
}
