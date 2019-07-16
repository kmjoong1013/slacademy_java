package exception_ex;

public class Exception04 {

	public void sub(int a) throws MyException {
		if(a>0) {
			System.out.println("a = " + a);
		}else {
			throw new MyException("a가 음수입니다.");
		}
	}
	
	public static void main(String[] args) {
		Exception04 obj = new Exception04();
		try {
			obj.sub(10);
			obj.sub(-5);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
