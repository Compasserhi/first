public class Order {
	public int orders;
	public int OrderNum;
	public int Price;
	public String name;

	String TransactionDate;
	public int CustomID;
	public int commodityID;

	public int count() {
		return Price*OrderNum;
	}
	public String TSNo() {
		return "ord"+orders;
	}

/* 	@Override
	public String toString() {
		return "Order{" +
				"orders=" + orders +
				", OrderNum=" + OrderNum +
				", Price=" + Price +
				", TransactionDate='" + TransactionDate + '\'' +
				", CustomID=" + CustomID +
				", commodityID=" + commodityID +
				'}';
	} */
}
