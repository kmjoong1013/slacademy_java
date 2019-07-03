package basic_syntax_ex;

public class Printf00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=110, b=57, r;
		r = a+b;
		System.out.println("a + b = " + r + " 출력 끝." );
		System.out.printf("hi '%s' your score\t %d\n", "kim", 87);
		System.out.printf("%d + %d = %d", a, b, r);
		
		a = 10;
		b = 20;
		double tot = 0;
		
		tot = a + b;
		System.out.printf("%d + %d = %f\n", a, b, tot);
		
		System.out.printf("%10d\n%10d\n%10d\n", 123000, 334000, 2300000);
	}

}
