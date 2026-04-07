package pr4.interfaces.model.task2;

public class Iphone implements SellableAndPluggable {
    @Override public void sell(){
        System.out.println("Iphone sold");
    }
    @Override public void plugIn(){
        System.out.println("iPhone plugged in");
    }
}
