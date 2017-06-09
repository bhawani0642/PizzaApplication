package prienc.java;

public class HealthyPizza extends ThreeStarPizza{
	
		// TODO Auto-generated constructor stub
	
	private String healthyextra1Name;
	private  Double healthyextra1Price;
	
	private String healthyextra2Name;
	private  Double healthyextra2Price;
	public HealthyPizza (String size, Double price) {
		super("Healthy", size, price, "Bonless");
		}
	public void addHeathtyexra1Name(String name,double price){
		this.healthyextra1Name=name;
		this.healthyextra1Price=price;
	}
	public void addHeathtyexra2Name(String name,double price){
		this.healthyextra2Name=name;
		this.healthyextra2Price=price;
		
	}
	@Override
	public double SelectPizza() {
		// TODO Auto-generated method stub
		double pizzaPrice = super.SelectPizza();
	
	if(this.healthyextra1Name!=null){
		pizzaPrice+= this.healthyextra1Price;
		System.out.println("Added " +this.healthyextra1Name+ "with an extra price of "+ this.healthyextra1Price);
	}
	if (this.healthyextra2Name!=null){
		pizzaPrice+= this.healthyextra2Price;
		System.out.println("Added "+this.healthyextra2Name+ "with an extra price of "+this.healthyextra2Price);
	}
	return pizzaPrice;
	}
	}

