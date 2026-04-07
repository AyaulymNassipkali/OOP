package Practice3.Problem1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Default");
        Giraffe giraffe1 = new Giraffe();
        giraffe1.makeSound();
        giraffe1.eat("grass", 5);
        System.out.println("Height: " + giraffe1.getHeight());
        System.out.println();

        System.out.println("Giraffe with parameters");
        Giraffe giraffe2 = new Giraffe("Melman", 10, 3.0);
        giraffe2.makeSound();
        giraffe2.eat();
        giraffe2.eat("grass");
        giraffe2.eat("grass", 10);

    }
}
