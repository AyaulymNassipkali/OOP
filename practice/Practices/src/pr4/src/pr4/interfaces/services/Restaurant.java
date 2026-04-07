package pr4.interfaces.services;
import pr4.interfaces.model.task1.*;

public class Restaurant {
    public boolean servePizza(CanHavePizza eater){
        eater.eatPizza();

        if(eater instanceof Person){
            System.out.println("Processing payment...");
        }
        return true;
    }
}
