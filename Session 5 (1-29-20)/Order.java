
public class Order {
	int orderNumber;
	String customerName;
	String foodType;
	char drinkType;
	
	public Order(int orderNumber, String customerName, String foodType, char drinkType) {
		this.orderNumber = orderNumber;
		this.customerName = customerName;
		this.foodType = foodType;
		this.drinkType = drinkType;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getFoodType() {
		return foodType;
	}

	public char getDrinkType() {
		return drinkType;
	}

	public String toString() {
		StringBuilder sb  = new StringBuilder();
		sb.append(String.format("OrderNumber: %d\n", getOrderNumber()));
		sb.append(String.format("CustomerName: %s\n", getCustomerName()));
		sb.append(String.format("FoodType: %s\n", getFoodType()));
		sb.append(String.format("DrinkType: %s\n", getDrinkType()+""));
		return sb.toString();
	}
}
