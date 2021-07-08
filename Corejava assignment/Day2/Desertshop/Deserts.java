package company;

public abstract class Deserts {
	private double price=0;
	private int tax=0,stock=0;
	
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getTax() {
		return tax;
	}
	
	public void setTax(int tax) {
		this.tax = tax;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
   public abstract double getcost(int n);
}
