package szlicht.daniel.spring_demo.rest_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    @GetMapping("/api/v1/animals")
    public Animal getAnimal() {
        return new Animal("Bambi", 40, "Słoń");
    }
    //zwracane obiekty Spring mapuje na jsony za pomocą biblioteki Jackson
    //wymaga ona aby konwertowane obiekty:
    //- posiadały bezparametrowy konstruktor
    //- posiadały gettery do wszystkich pól biorących udział w mapowaniu
}
