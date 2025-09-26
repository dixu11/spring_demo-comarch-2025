package szlicht.daniel.spring_demo.repository;

import szlicht.daniel.spring_demo.rest_controller.Animal;

import java.util.List;

public interface AnimalRepository {
    List<Animal> getAnimals();

   void addAnimal(Animal animal);

   //tu użyłem terminologii springa więc automat implementujący repozytorium nie miał z nią problemu
    Animal findById(int id);
}
