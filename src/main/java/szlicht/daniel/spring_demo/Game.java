package szlicht.daniel.spring_demo;

public class Game {

    private NpcRepository npcRepository;


    public Game(NpcRepository npcRepository) {
        this.npcRepository = npcRepository;
    }

    public String getFirstDialog() {
        Npc npc = npcRepository.readNpc();
        return String.format("%s: %s.", npc.getName(), npc.getGreeting());
    }
}
