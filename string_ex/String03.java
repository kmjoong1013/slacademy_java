package string_ex;

public class String03 {

	public static void main(String[] args) {
		String data1 = "ABCD";
		String data2 = "0BCD";
		
		if (data1.compareTo(data2)>0) {
			System.out.println(data1+"�� �� ũ��.");
		}else if (data1.compareTo(data2)<0) {
			System.out.println(data1+"�� �� �۴�.");
		}else {
			System.out.println("����");
		}
	}
}
