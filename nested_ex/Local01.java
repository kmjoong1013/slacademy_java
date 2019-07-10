package nested_ex;

public class Local01 {
	int a = 10;
	static int sa = 10;
	void fnA(){
		System.out.println("A : fn()");
	}
	static void sfnA(){
		System.out.println("A : sfn()");
	}
	
	void showLocal(int param1){
		int test = 10;
		class B{
			public void fnB(int ab){
				System.out.println(a);
				fnA();
				sfnA();
				System.out.println(param1);
				System.out.println(test);
			}
		}
		B obj = new B();
		obj.fnB(10);
	}
	
	public static void main(String[] args) {
		Local01 objA = new Local01();
		objA.showLocal(0);
	}
}
