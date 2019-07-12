package string_ex;

public class String03 {

	public static void main(String[] args) {
		String data1 = "ABCD";
		String data2 = "0BCD";
		
		if (data1.compareTo(data2)>0) {
			System.out.println(data1+"이 더 크다.");
		}else if (data1.compareTo(data2)<0) {
			System.out.println(data1+"이 더 작다.");
		}else {
			System.out.println("같다");
		}
	}
}
