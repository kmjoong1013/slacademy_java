package class_syntax;

public class Final01 {
	
	public final int X_POS = 10;
	public final static int Y_POS = 20;
	
	public static void main(String args[]) {
		
		Final01 obj = new Final01();
		
		System.out.println(obj.X_POS);
		//obj.X_POS = 100; => ¿À·ù°¡ »ý±è
		
	}
}
