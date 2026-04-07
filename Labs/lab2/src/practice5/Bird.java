package practice5;

public class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);
    }

    @Override
    public String getSound(){
        return "Chick-Chirick!";
    }
}
