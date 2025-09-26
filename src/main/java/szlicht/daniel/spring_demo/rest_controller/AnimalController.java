package szlicht.daniel.spring_demo.rest_controller;

import org.springframework.web.bind.annotation.*;
import szlicht.daniel.spring_demo.service.AnimalService;

import java.util.List;

@RestController
public class AnimalController {

    private AnimalService animalService;


    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

 /*   @GetMapping("/api/v1/animals")
    public Animal getAnimal() {
        return new Animal("Bambi", 40, "Słoń");
    }*/
    //zwracane obiekty Spring mapuje na jsony za pomocą biblioteki Jackson
    //wymaga ona aby konwertowane obiekty:
    //- posiadały bezparametrowy konstruktor
    //- posiadały gettery do wszystkich pól biorących udział w mapowaniu

 /*   @PostMapping("/api/v1/animals")
    public void addAnimal(@RequestParam String animal){ //domyślnie spring i tak użyje adnotacji RequestParam i oczekuje danych jako parametr
        System.out.println("Dodano " + animal);
    }*/


    @GetMapping("/api/v1/animals")
    public List<Animal> getAnimals() {
        return animalService.getAnimals();
    }

    @GetMapping("/api/v1/animals/{id}")
    public Animal getAnimal(@PathVariable int id) { // wycinanie ze ścieżki - konwencja przy wskazywaniu na konkretny zasób
        return animalService.getAnimal(id);
    }

    @PostMapping("/api/v1/animals")
    public void addAnimal(@RequestBody Animal animal){
        animalService.add(animal);
    }
}
