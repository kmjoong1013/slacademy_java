package string_ex;

public class String01 {

	public static void main(String[] args) {
		
		int a = 10;
		
		//int a2 = new int(10);
		
		String name = "홍길동";
		String name2 = new String ("홍길동"); //원래는 허용 안되지만 많이써서 허용
		
		if (name.equals( name2)) {
			System.out.println("같은이름");
		}else {
			System.out.println("다른이름");
		}
	}
}
