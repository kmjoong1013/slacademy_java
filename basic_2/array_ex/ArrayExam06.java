package array_ex;

import java.util.Scanner;

public class ArrayExam06 {

	public static void main(String[] args) {
		//다음 2차 배열에서 칸을 입력 받아 칸의 합계를 구하시오.
		int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("칸 입력 : ");
		int cell = in.nextInt();
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
				sum = sum + arr[i][cell];
			
			
		}
		System.out.println("\n"+(cell+1) + " cell sum : "+ sum);
		in.close();
	}
}
