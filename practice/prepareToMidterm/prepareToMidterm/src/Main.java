public class Main{
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

  //      Item item = new Item("Oranges", 4);
  //      Fruit fruit = new Fruit("Apples", 98, "Fuji");
  //      Weapon weapon = new Weapon("Sword", 34, 23, "Melee");

  //      inventory.addItem("Oranges", 4);
        inventory.addItem("Apple", 20, "Fuji");
        inventory.addItem("Sword", 34, 23, "Melee");

        inventory.displayInventory();
        inventory.displayInventory("Melee");
    }
}
