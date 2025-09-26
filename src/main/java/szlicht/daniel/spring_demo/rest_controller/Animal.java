package szlicht.daniel.spring_demo.rest_controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//mówi że ten obiekt ma swoją reprezentacje bazodanową
@Entity
public class Animal {

    @Id // klucz główny z SQL
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
