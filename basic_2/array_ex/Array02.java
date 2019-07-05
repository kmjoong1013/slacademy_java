package array_ex;

public class Array02 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5}; //1차 배열 초기값
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = %d\n", i, a[i]);
			//System.out.println(a[i]);
		}
		System.out.println("=====================");
		int b[];
		b = new int [] {1,2,3,4};
		for (int i = 0; i < b.length; i++) {
			System.out.printf("b[%d] = %d\n", i, b[i]);
		}
	}
}
