package basic_syntax_ex;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		int num=0;
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.println("숫자 입력 (종료-99)");
			num = in.nextInt();
					if (num==-99) {
						break;
					}else {
						if (num%2==0) {
							System.out.println("짝수");
						} else {
							System.out.println("홀수");
					}
					}
		}in.close();
	}
}


