package szlicht.daniel.spring_demo.repository;

import org.springframework.stereotype.Component;
import szlicht.daniel.spring_demo.rest_controller.Animal;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnimalInMemoryRepository implements AnimalRepository {
    private List<Animal> animals = new ArrayList<>();

    @Override
    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
}
