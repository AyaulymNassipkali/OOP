package Lab1;

public class Task2 {
	public enum CoffeeType{
		ESPRESSO,
		LATTE,
		CAPPUCCINO,
		AMERICANO
	}
	
	public static final double TAX_RATE = 0.08;
	private static int totalCupsSold = 0;
	private final String shopId;
	private String shopName;
	private double dailyRevenue;
	private CoffeeType bestSeller;
	
	static {
		System.out.println("Coffee Shop System started!");
	}
	
	{
		dailyRevenue = 0.0;
		System.out.println("Setting up new coffee shop...");
	}
	
	public Task2(String name, CoffeeType seller) {
		this.shopName = name;
		this.bestSeller = seller;
		this.shopId = "SHOP" + System.currentTimeMillis();
	}
	
	public Task2(String shop) {
		this(shop, CoffeeType.LATTE);}
	
	public void sellCoffee(CoffeeType type, double price) {
		double total = price +(price * TAX_RATE);
		dailyRevenue += total;
		totalCupsSold++;
		System.out.println("Sold " + type + " for $" + total);
	}
	
	public void sellCoffee(CoffeeType type) {
		double basePrice = 0.0;
		
		switch(type) {
		case ESPRESSO: basePrice = 2.5; break;
		case LATTE: basePrice = 3.5; break;
		case CAPPUCCINO: basePrice = 3.0; break;
		case  AMERICANO: basePrice = 2.0; break;
		}
		
		sellCoffee(type, basePrice);
	}
	
	public String getShopId() {
		return shopId;
	}
	
	public String getShopName() {
		return shopName;
	}
	
	public double getDailyRevenue() {
		return dailyRevenue;
	}
	
	public CoffeeType getBestSeller() {
		return bestSeller;
	}
	
	public static int getTotalCupsSold() {
		return totalCupsSold;
	}
	
	@Override
	public String toString() {
		return shopName + " [ID: " + shopId + "] - Revenue: $" + dailyRevenue;
	}
	
	
		
	
	//demostration part:

	    public static void main(String[] args) {
	        Task2.CoffeeType myCoffee = Task2.CoffeeType.LATTE;
	        Task2 shop1 = new Task2("Original Coffee", Task2.CoffeeType.ESPRESSO);
	        Task2 shop2 = new Task2("Weekend Coffee"); 
	        
	        System.out.println(shop1);
	        System.out.println(shop2);

	        shop1.sellCoffee(Task2.CoffeeType.LATTE, 4.0);
	        shop1.sellCoffee(Task2.CoffeeType.ESPRESSO); 
	        shop2.sellCoffee(Task2.CoffeeType.CAPPUCCINO);

	        System.out.println("\nShop 1 ID (read-only): " + shop1.getShopId());
	        
	        System.out.println("Total cups sold: " + Task2.getTotalCupsSold());
	        
	        System.out.println("Tax rate is: " + (Task2.TAX_RATE * 100) + "%");

	        System.out.println("\nAvailable coffees:");
	        for (Task2.CoffeeType type : Task2.CoffeeType.values()) {
	            System.out.println("- " + type);
	        }
	}
}
