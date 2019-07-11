package wrapper_ex;

public class Integer03 {

	public static void main(String[] args) {
		String strData1 = "100";
		String strData2 = "200";
		
		System.out.println(strData1+strData2);
		
		int a = Integer.parseInt(strData1);
		int b = Integer.parseInt(strData2);
		
		System.out.println(a+b);
		
		Integer iData1 = new Integer("100");
		Integer iData2 = new Integer("200");
		
		int tot = iData1.intValue()+iData2.intValue();
		System.out.println(tot);
	}
}
