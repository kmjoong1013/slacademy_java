package string_ex;

public class String01 {

	public static void main(String[] args) {
		
		int a = 10;
		
		//int a2 = new int(10);
		
		String name = "ȫ�浿";
		String name2 = new String ("ȫ�浿"); //������ ��� �ȵ����� ���̽Ἥ ���
		
		if (name.equals( name2)) {
			System.out.println("�����̸�");
		}else {
			System.out.println("�ٸ��̸�");
		}
	}
}
