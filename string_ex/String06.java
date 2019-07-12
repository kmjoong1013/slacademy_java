package string_ex;

public class String06 {

	public static void main(String[] args) {
		String data = "#@$@#$kim";
		String data2 = data.substring(6);
		System.out.println("data.substring(6) : "+ data2);
		
		String data3 = "#$#lee@#$@#";
		String data4 = data3.substring(3,6);
		System.out.println("data3.substring(3,6); : "+ data4);
		
		String data5 = "$lee@100@#";
		String data6 = data5.substring(1,4);
		String data7 = data5.substring(5,8);
		
		String msg = data6 + "´Ô Á¡¼ö´Â" + data7;
		System.out.println(msg);
	}
}
