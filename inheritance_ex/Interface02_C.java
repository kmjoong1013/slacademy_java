package inheritance_ex;

public class Interface02_C implements Interface02_B{

	@Override
	public void prn() {
		// TODO Auto-generated method stub
		System.out.println(POS_X);
		System.out.println(POS_Y);
	}
	
	public static void main(String[] args) {
		Interface02_C obj = new Interface02_C();
		obj.prn();
	}

}
