// Sheep.java - Concrete class extending Animal and implementing Countable
public class Sheep extends Animal implements Countable {

    public Sheep() {
        super();
    }

    @Override
    public void incrementCount() {
        count += 2;
        System.out.println("Added 2 more sheep.");
    }

    @Override
    public void makeSound() {
        System.out.println("Sheep makes baa sound");
    }
}
