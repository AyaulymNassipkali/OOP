package pr4.interfaces.model.task1;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable {
    public Student(String name) { super(name); }
    @Override
    public void eatPizza(){
        System.out.println(name + " eatPizza!");
    }
    @Override
    public void retakeExam(){
        System.out.println(name + " retakeExam");
    }
    @Override
    public void move(){
        System.out.println(name + " move");
    }
    @Override
    public void dance(){
        System.out.println(name + " dance");
    }
}
