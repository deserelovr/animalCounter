public class Alligator extends Animal implements Countable {

    public Alligator() {
        super();
    }

    @Override
    public void incrementCount() {
        this.count++;
        System.out.println("Alligator count incremented: " + this.count);
    }
}
