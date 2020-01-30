
public class OrderUtilities {
	public OrderUtilities() {};
	
	public Order combineOrder(Order one, Order two) {
		String combinedOrderFood = one.getFoodType() + " " + two.getFoodType();
		int newOrderNumber;
		if(one.getOrderNumber()<two.getOrderNumber())
			newOrderNumber = one.getOrderNumber();
		else
			newOrderNumber = two.getOrderNumber();
		Order o = new Order(newOrderNumber, one.getCustomerName(), combinedOrderFood, one.getDrinkType());
		return o;
	}
}
