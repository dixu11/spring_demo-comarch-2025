package szlicht.daniel.spring_demo;

public class Npc {

    private String name;
    private String greeting;

    public Npc(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public String getGreeting() {
        return greeting;
    }
}
