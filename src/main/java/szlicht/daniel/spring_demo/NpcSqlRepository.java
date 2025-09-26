package szlicht.daniel.spring_demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("sql") //zleca springowi stworzenie obiektu z tej klasy
//@Primary //ten obiekt będzie wstrzykiwany w pierwszej kolejności (Dependency Injection)
public class NpcSqlRepository implements  NpcRepository{

    public NpcSqlRepository() {
        System.out.println("Tworzymy NpcSqlRepository");
    }

    public Npc readNpc() {
        System.out.println("reading sql");
        return new Npc("Dawid", "Cześć");
    }
}
