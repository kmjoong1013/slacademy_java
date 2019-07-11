package generic_ex;

public class Generic01<T> {
	T num;
	
	public Generic01(T num) {
		this.num = num;
	}
	
	public void prn() {
		System.out.println("num : "+num);
	}
}
