package prienc.java;

public class ThreeStarPizza {
	private String name;
	private String size;
	private Double price;
	private String chicken;
	
	
	
	private String addition1Name;
	private double addition1Price;
	
	private String addition2Name;
	private double addition2Price;
	
	private String addition3Name;
	private double addition3Price;
	
	private String addition4Name;
	private double addition4Price;
	
	public ThreeStarPizza(String name, String size, Double price, String chicken) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		this.chicken = chicken;
	}
	public void addpizzaAddition1(String name,double price){
	this.addition1Name= name;
	this.addition1Price=price;
	}
	public void addpizzaAddition2(String name,double price){
		this.addition2Name= name;
		this.addition2Price=price;
	}
	public void addpizzaAddition3(String name,double price){
		this.addition3Name= name;
		this.addition3Price=price;
}

public void addpizzaAddition4(String name,double price){
	this.addition4Name= name;
	this.addition4Price=price;
}
public double SelectPizza(){
	double pizzaPrice=this.price;
	System.out.println(this.name +"pizza " +this.size+" size "+ this.chicken+"with chicken"+ "has a price of "+this.price );

if(this.addition1Name!=null){
	 pizzaPrice +=this.addition1Price;
	 System.out.println("Added" +this.addition1Name+"For an extra "+this.addition1Price );
	 
}
if(this.addition2Name!=null){
	 pizzaPrice +=this.addition2Price;
	 System.out.println("Added " +this.addition2Name+"For an extra "+this.addition2Price );
}
if(this.addition3Name!=null){
	 pizzaPrice +=this.addition3Price;
	 System.out.println("Added " +this.addition3Name+"For an extra "+this.addition3Price );
}
if(this.addition4Name!=null){
	 pizzaPrice +=this.addition4Price;
	 System.out.println("Added " +this.addition4Name+"For an extra "+this.addition4Price );
}
return pizzaPrice;
}
}