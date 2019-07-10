package nested_ex;

class AA2{
	int aa = 10;
	void sub() {
		
	}
	class BB2{
		final static double PI = 3.14;
		int bb = aa + 10;
		void sub() {
			System.out.println(bb);
		}
	}
	BB2 obj = new BB2();
}
public class Member01 {

	public static void main(String[] args) {
		AA2 a = new AA2();
		System.out.println(AA2.BB2.PI);
		//AA3.BB b;
		//b = a.new BB();
		AA2.BB2 b = a.new BB2();
		
		System.out.println("PI 값은 " + AA2.BB2.PI );
		System.out.println("BB 클래스 내부 변수 bb = " + b.bb);
		//AA3 objA = new AA3();
		//System.out.println(objA.BB.PI);
	}
}
