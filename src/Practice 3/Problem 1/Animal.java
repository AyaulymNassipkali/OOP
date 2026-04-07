package Practice3.Problem1;

public class Animal {
    private final String name;
    private final int age;

    public Animal() {
        System.out.println("Animal default constructor called");
        this.name = "";
        this.age = 0;
    }

    public Animal(String name, int age) {
        System.out.println("Animal parameterized constructor called with name: " + name);
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot have a negative value");
        }

        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound");
    }

    // Overloading
    public void eat() {
        System.out.println(name + " eats");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
    }

    public void eat(String food, int amount) {
        System.out.println(name + " eats " + amount + " kg of " + food);
    }

    public void amountOfLegs(int legs) {
        System.out.println(name + " has " + legs + " legs");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
