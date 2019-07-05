package array_ex;

public class ArrayExam05 {

	public static void main(String[] args) {
		// 다음 2차 배열의 전체 합계를 구하시오.
		int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("sum:"+sum);
	}
}
