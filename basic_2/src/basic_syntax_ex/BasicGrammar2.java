package basic_syntax_ex;

public class BasicGrammar2 {
	
	static int sa = 10;
	
	// sub() 메소드
	static void sub() {
		int b;
		System.out.println("a = " + sa);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		sub();
		System.out.println("a = "+ a);
		System.out.println("sa = "+ sa);
		//System.out.println("b = "+ b);
	}

}
