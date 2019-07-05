package array_ex;

public class ArrayExam02 {

	public static void main(String[] args) {
		//배열에 있는 값을 오름차순 정렬
		//for(int j=1,2,3,4,5,6) {
		//if(a[0] > a[j] {
		//int temp;
		//temp = a[0];
		//a[0] = a[j];
		//a[j] = temp;
		//}
		//}
		
		int a[] = {30,13,45,134,34,55,57};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < 7; i++) {
			System.out.print(" "+a[i]);
		}
	}
}
