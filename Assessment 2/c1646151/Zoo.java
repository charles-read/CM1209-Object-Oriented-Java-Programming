/*
 * Name: Charles David Read 
 * Student number: c1646151
 */

/*
 * A class to represent a zoo.
 * A zoo can either have unlimited animal capacity or limited animal capacity.
 * For limited capacity zoos, animals on loan to other zoo collections still count towards the
 * capacity (there must be space reserved for when an animal is returned).
 */
import java.util.Vector;

public class Zoo {
    
    private Vector <Animal> zooAnimals;
    private int capacity;


    /*
     * Construct a Library with unlimited capacity.
     */
    public Zoo() {

        zooAnimals = new Vector <Animal> ();
        this.capacity = -1;
    }


    /*
     * Construct a Library with limited capacity.
     */
    public Zoo(int inCapacity) {
        if (inCapacity < 1) {
            throw new IllegalArgumentException("Error: Invalid Capacity. Must be Int > 0.");
        }
        zooAnimals = new Vector < Animal > (inCapacity);
        this.capacity = inCapacity;
    }


    public void addAnimal(Animal newAnimal) {
        if (capacity == -1) {
            zooAnimals.add(newAnimal);
        } else if (capacity >= newAnimal.getAvailableAnimals() + numberAvailableAnimals()) {
            zooAnimals.add(newAnimal);
        } else {
            throw new IllegalStateException("Error: Capacity limit reached.");
        }
    }


    public boolean hasAnimalWithName(String animalName) {
        for (int k = 0; k < zooAnimals.size(); k++) {
            if (animalName.toLowerCase().equals(zooAnimals.get(k).getName().toLowerCase())) {
                return true;
            }
        }
        return false;
    }


    public Animal getAnimalWithName(String animalName) {
        for (int j = 0; j < zooAnimals.size(); j++) {
            if (animalName.toLowerCase().equals(zooAnimals.get(j).getName().toLowerCase())) {
                return zooAnimals.get(j);
            }
        }
        return null;
    }


    public int numberAvailableAnimals() {
        int animalTotal = 0;
        for (int i = 0; i < zooAnimals.size(); i++) {
            Animal animal = zooAnimals.get(i);
            animalTotal += animal.getAvailableAnimals();
        }
        return animalTotal;
    }
}