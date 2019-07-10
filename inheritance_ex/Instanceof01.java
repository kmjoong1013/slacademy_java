package inheritance_ex;

public class Instanceof01 {

	public void setobj(Object obj) {
		
		if (obj instanceof Abstract01_B) {
			obj = new Abstract01_B(1000, 4);
			System.out.println("test");
		}
		
	}
	
	public static void main(String[] args) {
		Abstract01_B obj = null;
		obj = new Abstract01_B(1000,3);
		
		if (obj instanceof Abstract01_B) {	//obj가 Abstract01_A와 같은 종류의 객체인지 비교
			obj = new Abstract01_B(1000, 3);
			
		}
		System.out.println("obj.getClass().getName():"+obj.getClass().getName());
		System.out.printf("obj.hashCode():%x",obj.hashCode());
	}
}
