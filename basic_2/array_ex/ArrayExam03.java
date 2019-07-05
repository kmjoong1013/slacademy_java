package array_ex;

import java.util.Scanner;

public class ArrayExam03 {
	
	public static void dataInput(int a[]) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("a["+i+"]= ");
			a[i] = in.nextInt();
		}in.close();
	}

	public static void main(String[] args) {
		/*int배열을 4개 선언하고 for문과 scanner를 이용해서
		 키보드로 배열에 점수를 입력하고
		 입력된 배열 값을 출력하고
		 최대값과 최소값 총점과 평균도 출력하시오
		 메소드 사용 권장
		 예) a[0]=1
		 	a[1]=2
		 	a[2]=10
		 	a[3]=20
		 	최대값=20
		 	최소값=1
		 	총점=3
		 	평균=8
		 */
		
		int a[] = new int [4];
		
		dataInput(a);
		
		int max = a[0];
		int min = a[0];
		double avg = 0;
		int total = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (max<a[i]) {
				max = a[i];
			}
			else if (min>a[i]) {
				min = a[i];	
		}
			total += a[i];
			avg = (double)total/4;
		
		}
		
		System.out.println("최대 : "+max);		
		System.out.println("최소 : "+min);
		System.out.println("평균 : "+avg);
		System.out.println("합계 : "+total);
			
	}
}
