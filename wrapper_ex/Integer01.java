package wrapper_ex;

public class Integer01 {

	public static void main(String[] args) {
		Integer a = new Integer(100);//100을 이용해서 Integer 객체생성
		
		Integer b = new Integer("200");//"200"을 Integer로 변환해서 객체생성
		System.out.println(a+b);
		
		String strNum = "770";
		
		int num = Integer.parseInt(strNum); //parseInt는 문자열을 integer로 변환해서 리턴
		
		//byte byteNum = a;
	}
}
