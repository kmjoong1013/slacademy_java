package enum_ex;

import java.util.Scanner;

public class Enum01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1.red, 2.green, 3.blue");
		int color = in.nextInt();
		
		MyColor myColor = null;//enum����
		
		//myColor = MyColor.BLUE; enum�� ����
		
		switch (color) {
		case 1:
			myColor = MyColor.RED;
			break;
		case 2:
			myColor = MyColor.GREEN;
		case 3:
			myColor = MyColor.BLUE;
			break;
		}
		
		if (myColor == (MyColor.RED)) {
			System.out.println("������");
		}else if(myColor == (MyColor.GREEN)) {
			System.out.println("�ʷϻ�");
		}else if(myColor == (MyColor.BLUE)) {
			System.out.println("�Ķ���");
		}
	}
}
