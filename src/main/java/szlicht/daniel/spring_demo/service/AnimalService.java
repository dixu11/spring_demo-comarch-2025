package szlicht.daniel.spring_demo.service;

import org.springframework.stereotype.Service;
import szlicht.daniel.spring_demo.repository.AnimalRepository;
import szlicht.daniel.spring_demo.rest_controller.Animal;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> getAnimals() {
        return animalRepository.getAnimals();
    }

    public void add(Animal animal) {
        animalRepository.addAnimal(animal);
    }

    public Animal getAnimal(int id) {
        return animalRepository.findById(id);
    }
}
