package class_syntax;

public class OverLoadingEx {

	private void sum(int a, int b) {
		int r;
		r = a + b;
		System.out.println("sum(int a,int b) r = "+r);
	}
	
	private void sum(int a) {
		int r;
		int b = 10;
		System.out.println("b가 없으므로 10으로 간주한다");
		r = a +b;
		System.out.println("sum(inta, int b) r = " + r);
	}
	
	public void sum (double a, double b) {
		double r;
		r = a + b;
		System.out.println("sum(double a, double b) r = " + r);
	}
	
	public static void main(String[] args) {
		OverLoadingEx obj = new OverLoadingEx();
		obj.sum(10.245, 20);
	}
}
