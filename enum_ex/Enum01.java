package enum_ex;

import java.util.Scanner;

public class Enum01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1.red, 2.green, 3.blue");
		int color = in.nextInt();
		
		MyColor myColor = null;//enum선언
		
		//myColor = MyColor.BLUE; enum값 대입
		
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
			System.out.println("빨간색");
		}else if(myColor == (MyColor.GREEN)) {
			System.out.println("초록색");
		}else if(myColor == (MyColor.BLUE)) {
			System.out.println("파란색");
		}
	}
}
