package wrapper_ex;

public class Integer01 {

	public static void main(String[] args) {
		Integer a = new Integer(100);//100�� �̿��ؼ� Integer ��ü����
		
		Integer b = new Integer("200");//"200"�� Integer�� ��ȯ�ؼ� ��ü����
		System.out.println(a+b);
		
		String strNum = "770";
		
		int num = Integer.parseInt(strNum); //parseInt�� ���ڿ��� integer�� ��ȯ�ؼ� ����
		
		//byte byteNum = a;
	}
}
