public abstract class Item {
    private String Name;
    private int Quantity;
    private String name;
    private int quantity;

    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public abstract String displayInfo();

}
