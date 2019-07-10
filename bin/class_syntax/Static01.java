/**
 * instance 변수는 힙 메모리에 필요할 때 생성
 */
package class_syntax;

public class Static01 {
	
	public static int X_POS = 10; //static 변수
	public static int Y_POS = 20; //static 변수
	
	public int x = 10; //instance 변수
	public int y = 10; //instance 변수
	
	public void prn() { //instance 메소드
		System.out.println("X_POS :" + X_POS);
		System.out.println("x :" + x);
	}
	
	//static 메소드는 클래스를 붙여서 호출 할 수 있다.
	public static void sprn() {
		System.out.println("static sprn========");
		System.out.println("X_POS :" + X_POS);
		System.out.println("Y_POS :" + Y_POS);
	}
}
