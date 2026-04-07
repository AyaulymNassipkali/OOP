package Practice3.Problem1;

public class Giraffe extends Animal {
    private final double height;

    public Giraffe() {
        super("Unnamed giraffe", 0);
        System.out.println("Giraffe default constructor called");
        this.height = 3.0;
    }

    public Giraffe(String name, int age, double height) {
        super(name, age);
        System.out.println("Calling Giraffe with parameters");

        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be less or equal to zero");
        }

        this.height = height;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the giraffe eats food");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the giraffe stretches its long neck to eat " + food);
    }

    @Override
    public void eat(String food, int amount) {
        System.out.println(getName() + " the giraffe stretches its long neck to eat " + amount + " kg of " + food);
    }

    @Override
    public void makeSound() {
        System.out.println("Giraffes make Infrasonic Hum");
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Giraffe{name = '" + getName() + "', age = " + getAge() + ", height = " + getHeight() + "}";
    }
}
