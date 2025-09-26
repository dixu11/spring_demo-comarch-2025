package szlicht.daniel.spring_demo.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import szlicht.daniel.spring_demo.rest_controller.Animal;

import java.util.List;

@Primary
public interface SqlAnimalRepository extends JpaRepository<Animal,Integer>, AnimalRepository {

    //synchronizuję interfejsy
    default void addAnimal(Animal animal){
        save(animal);
    }

    default List<Animal> getAnimals() {
        return findAll();
    }


}
