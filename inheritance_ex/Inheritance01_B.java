package inheritance_ex;

//sub class
public class Inheritance01_B extends Inheritance01_A{ //sub class (is a)	
	private int quantity;
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void prn() {
		setPrice(1000);
		System.out.println("price :" +getPrice());
		System.out.println("price :" +quantity);
		
	}
	
	public static void main(String[] args) {
		Inheritance01_B obj = new Inheritance01_B();
		obj.setQuantity(7);
		obj.prn();
		
		//Inheritance01_A objA = new Inheritance01_A(); => has a
		Inheritance01_B objPoly = new Inheritance01_B(); 
		
	}

}
