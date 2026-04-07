public class Fruit implements ItemStuff{
    private String name;
    private int quantity;
    private String type;

    public Fruit(String name, int quantity, String type){
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    public String getType(){return type;}

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getQuantity(){
        return quantity;
    }

    @Override
    public String toString() {
        return "Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type:" + type;
    }
}
