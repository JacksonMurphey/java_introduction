import classes.Animal;
import classes.ZooKeeper;

import java.util.*;

public class ZooApp {

    public static void main(String[] args) {


        // Animal zebra = new Animal("zebra", "Zak", "leaves", 5);
        // Animal penguin = new Animal("penguin", "Peggy", "fish", 2);
        Animal lion = new Animal("lion", "Simba", "pumba", 3);

        // System.out.println(zebra.getStats());
        // System.out.println(penguin.getStats());

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("zebra", "Zak", "leaves", 5));
        animals.add(new Animal("penguin", "Peggy", "fish", 2));
        animals.add(lion);


        

        ZooKeeper zoo = new ZooKeeper(animals);

        zoo.listAnimals();
        zoo.animalEats(lion);
        
    }
}