package array_ex;

public class ArrayExam01 {

	public static void main(String[] args) {
		//배열에 있는 값 중 제일 큰 값과 큰 값의 index를 출력하시오
		int a[] = {30,13,45,134,34,55,57};
		int max = a[0];
		int index = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (max<a[i]) {
				max = a[i];
				index = i;
			}
		}System.out.println(max);
		System.out.println("["+index+"]");
	}
}
