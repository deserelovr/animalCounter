public abstract class Animal {
    protected int count;

    public Animal() {
        this.count = 0;
    }

    public void resetCount() {
        this.count = 0;
    }

    public int getCount() {
        return this.count;
    }
}
