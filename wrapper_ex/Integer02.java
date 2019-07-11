package wrapper_ex;

public class Integer02 {

	public static void main(String[] args) {
		int n = 300;
		Integer wrapperInt = n; //auto-boxing
		////////////////////////
		int n2 = 300;
		Integer wrapperInt2 = n2; //auto-unboxing
		int n3 = wrapperInt2;
	}
}
