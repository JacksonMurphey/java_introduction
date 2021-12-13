package classes;
import java.util.*;
import classes.Animal;

public class ZooKeeper {

    private List<Animal> animals;

    public ZooKeeper(List<Animal> animals) {
        this.animals = animals;
    } // 

    public void listAnimals() {
        for(Animal animal : this.animals){
            System.out.printf("%s\n", animal.getStats());
        }

    }

    Animal myAnimal = new Animal();
    public void animalEats() {
        System.out.println(myAnimal.eatsWhat());
    }

}