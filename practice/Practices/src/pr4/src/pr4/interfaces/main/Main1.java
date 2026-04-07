package pr4.interfaces.main;
import pr4.interfaces.model.task1.*;
import pr4.interfaces.services.*;

public class Main1 {
    public static void main(String[] args){
        Restaurant dodo = new Restaurant();

        Cat cat = new Cat();
        Student ngd = new Student("Beka");

        dodo.servePizza(cat);
        dodo.servePizza(ngd);
    }
}
