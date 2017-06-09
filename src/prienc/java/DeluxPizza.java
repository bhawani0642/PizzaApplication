package prienc.java;

public class DeluxPizza extends ThreeStarPizza {

	public DeluxPizza() {
		super("Delux pizza", "large", 15.00, "chizza");
		// TODO Auto-generated constructor stub
		super.addpizzaAddition1("chips", 15.00);
		super.addpizzaAddition2("Drinks", 20.00);
	}

	@Override
	public void addpizzaAddition1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("No more addition is allowed");
	}

	@Override
	public void addpizzaAddition2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("No more addition is allowed");
	}

	@Override
	public void addpizzaAddition3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("No more addition is allowed");
	}

	@Override
	public void addpizzaAddition4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("No more addition is allowed");
	}

}
