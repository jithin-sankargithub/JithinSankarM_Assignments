package company;

public class Candys extends Deserts implements Owner,Customer {
	Candys(double p,int t,int s)
	{
		this.setPrice(p);
		this.setStock(s);
		this.setTax(t);
	}
	public void getDetails() {
		System.out.println("Candys Price is " +this.getPrice()+ "Dollars Stock is " +this.getStock()+ "Tax is" +this.getTax());
	}
	public double getcost(int n) {
		double cost=0,taxamount=0;
		cost=this.getPrice()*n;
		taxamount=(cost*this.getTax())/100;
		cost=cost+taxamount;
		cost=cost*60;
		return cost;
	}
	public void addItem(int n)
	{
		this.setStock(this.getStock()+n);
		System.out.println("Stock is");
		getDetails();
	}
	public void buyItem(int n) {
		this.setStock(this.getStock()-n);
		System.out.println("Total cost");
		System.out.println(getcost(n));
		
	}


}
