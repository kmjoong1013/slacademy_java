package string_ex;

import java.util.Scanner;

public class StringExam02 {

	public static void main(String[] args) {
		/* Ű����� YYYYMMDD �� �ش��ϴ� �����͸� ���ڿ��� �Է� �޾�
		 * �Է¹��� ���ڿ��� ���̰� 8�ڰ� ������ ���� �޼��� ��� 8�� ���ϸ� �Ʒ� ���� ó�� 
		 * 0000�� 00�� 00�� �̶�� ����ϰ� 
		 * 3������ 5���̸� ��
		 * 6������ 8���̸� ����
		 * 9������ 11�� �̸� ����
		 * 12������ 2���̸� �ܿ��̶�� ��� �Ͻÿ�.
		 * 20190301
		 */
		/*char dst[] = new char[8];
		String YYYY;
		String MM;
		String DD;
		
		Scanner in = new Scanner(System.in);
		System.out.print("YYYY�Է� : ");
		YYYY = in.next();
		System.out.print("MM�Է� : ");
		MM = in.next();
		System.out.print("DD�Է� : ");
		DD = in.next();

		System.out.println(YYYY+"�� "+MM+"�� "+DD+"��");
		int MM1 = new Integer(MM);
		if (MM1>=3 && MM1<=5) {
			System.out.println("��");
		}else if(MM1>=6 && MM1<=8){
			System.out.println("����");
		}else if(MM1>=9 && MM1<=11){
			System.out.println("����");
		}else{
			System.out.println("�ܿ�");
		}*/
		
		Scanner in = new Scanner(System.in);
		System.out.println("YYYYMMDD");
		String ymd = in.next();
		if (ymd.length()>8) {
			System.out.println("8�� �̻��Դϴ�");
			return;
		}
		String yearStr = ymd.substring(0,4);
		String monthStr = ymd.substring(4,6);
		String dateStr = ymd.substring(6);
		System.out.println(yearStr+"�� " + monthStr+"�� " + dateStr+"��");
		
		int month = Integer.parseInt(monthStr);
		if (month>=3 && month<=5) {
			System.out.println("��");
		}else if(month>=6 && month<=8){
			System.out.println("����");
		}else if(month>=9 && month<=11){
			System.out.println("����");
		}else{
			System.out.println("�ܿ�");
		}
	}
}
