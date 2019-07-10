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
		
		if (obj instanceof Abstract01_B) {	//obj�� Abstract01_A�� ���� ������ ��ü���� ��
			obj = new Abstract01_B(1000, 3);
			
		}
		System.out.println("obj.getClass().getName():"+obj.getClass().getName());
		System.out.printf("obj.hashCode():%x",obj.hashCode());
	}
}
