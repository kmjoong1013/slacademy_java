/**
 * instance ������ �� �޸𸮿� �ʿ��� �� ����
 */
package class_syntax;

public class Static01 {
	
	public static int X_POS = 10; //static ����
	public static int Y_POS = 20; //static ����
	
	public int x = 10; //instance ����
	public int y = 10; //instance ����
	
	public void prn() { //instance �޼ҵ�
		System.out.println("X_POS :" + X_POS);
		System.out.println("x :" + x);
	}
	
	//static �޼ҵ�� Ŭ������ �ٿ��� ȣ�� �� �� �ִ�.
	public static void sprn() {
		System.out.println("static sprn========");
		System.out.println("X_POS :" + X_POS);
		System.out.println("Y_POS :" + Y_POS);
	}
}
