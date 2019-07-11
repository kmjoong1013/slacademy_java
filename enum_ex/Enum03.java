package enum_ex;

import java.util.Scanner;

public class Enum03 {

	public static void main(String[] args) {
		MyColor myColorArr[] = MyColor.values();
		//Enum() enum�� ���ڿ� �̸� ����,ordinal() �ڵ����� �ο��� ���ڸ���
		for(int i = 0; i < myColorArr.length; i++) {
			System.out.println(myColorArr[i].name()+":" + myColorArr[i].ordinal());
		}
		
		Scanner in = new Scanner(System.in);
		int color = in.nextInt();
		for (int i = 0; i < myColorArr.length; i++) {
			if (myColorArr[i].ordinal() == color) {
				System.out.println(myColorArr[i].name());
			}
		}
	}
}
