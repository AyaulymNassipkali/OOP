package pr4.interfaces.main;
import pr4.interfaces.model.task2.Iphone;
import pr4.interfaces.model.task2.LogicGame;
import pr4.interfaces.model.task2.MemoryGame;
import pr4.interfaces.services.App;

public class Main2 {
    public static void main(String[] args){
        App app = new App();
        LogicGame logic = new LogicGame();
        MemoryGame memory = new MemoryGame();

        app.getStatistics(logic);
        app.getStatistics(memory);

        Iphone phone = new Iphone();
        phone.sell();
        phone.plugIn();
    }
}
