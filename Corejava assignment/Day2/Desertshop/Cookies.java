package company;

public  class Cookies extends Deserts implements Owner,Customer{
	Cookies(double p,int t,int s){
		this.setPrice(p);
		this.setTax(t);
		this.setStock(s);
	}
	public void getDetails(){
		System.out.println("2. Cookie  Price   : "+this.getPrice()+" Dollars  Stock  : "+this.getStock()+"  Tax is  " +this.getTax()+"%");
	}
	public double getcost(int n){
		double cost=0,taxAmount=0;
		cost=this.getPrice()*n;
		taxAmount = (cost*this.getTax())/100;
		cost=cost+taxAmount;
		cost=cost*70;
		return cost;
	}
	public void addItem(int n){
		this.setStock(this.getStock()+n);
		System.out.println("\nStock upadated successfully\n Current stock\n");
		getDetails();
	}
	public void buyItem(int n){
		this.setStock(this.getStock()-n);
		System.out.println("Total cost");
		System.out.print(getcost(n));
		
	}
	
}