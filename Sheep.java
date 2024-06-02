public class Sheep extends Animal implements Countable {

    public Sheep() {
        super();
    }

    @Override
    public void incrementCount() {
        this.count += 2;
        System.out.println("Sheep count incremented: " + this.count);
    }
}
