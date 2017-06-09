package prienc.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*ThreeStarPizza pizza= new ThreeStarPizza("Crispy ","Medium ",25.0,"Ckinen bites added ");
 double price= pizza.SelectPizza();
 pizza.addpizzaAddition1("extra cheese " , 32.0);
 pizza.addpizzaAddition2("extra chicken bytes " , 40.0);
 pizza.addpizzaAddition3("extra sauces " , 2.00);
 pizza.addpizzaAddition4("water " , 25.00);
 System.out.println("Total price of pizza is = "+pizza.SelectPizza());*/
	
HealthyPizza healthyPizza= new HealthyPizza("Medium",40.00);
healthyPizza.addHeathtyexra1Name("Health1", 32.00);
healthyPizza.addHeathtyexra2Name("health2", 56.87);
System.out.println("Total price of the healthy piza= " + healthyPizza.SelectPizza());

DeluxPizza dp= new DeluxPizza();
dp.SelectPizza();
dp.addpizzaAddition1("chips", 20.00);
}
}