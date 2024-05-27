// Alligator.java - Concrete class extending Animal and implementing Countable
public class Alligator extends Animal implements Countable {

    public Alligator() {
        super();
    }

    @Override
    public void incrementCount() {
        count++;
        if (count > 0) {
            System.out.println("Added 1 more alligator.");
            if (count > 1) {
                count--;
                System.out.println("Deducted 1 sheep.");
            }
        } else {
            System.out.println("Count is less than or equal to zero. Can't increment Alligator.");
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Alligator makes hissing sound");
    }
}
