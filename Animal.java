// Animal.java - Abstract class
public abstract class Animal {
    protected int count; // number of animals

    public Animal() {
        this.count = 0;
    }

    public void resetCount() {
        this.count = 0;
    }

    public int getCount() {
        return this.count;
    }

    public abstract void makeSound();
}
