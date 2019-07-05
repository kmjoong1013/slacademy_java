package array_ex;

import java.util.Scanner;

public class ArrayExam04 {

	public static void main(String[] args) {
		// 키보드로 줄을 입력하면 해당 줄의 합계를 출력
		int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		
		Scanner in = new Scanner(System.in);
		int line = in.nextInt();
		int sum = 0;
		
		for (int j = 0; j < arr[line].length; j++) {
			sum += arr[line][j];
		}
		System.out.println("\n"+line + "line sum : "+ sum);
		in.close();
	}
}
