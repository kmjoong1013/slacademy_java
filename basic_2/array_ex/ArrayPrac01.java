package array_ex;

public class ArrayPrac01 {

	public static void main(String[] args) {
		int a[] = {13,24,56,32,11,30,33};
		int b[] = {11,24,22,45,3};
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < a.length; i++) {
			if ((i+1)%2==0) {
				a[i]=0;
			}
			if ((i+1)%2==1) {
				odd = odd + a[i];
			}
			System.out.print(" "+a[i]);
		}
		System.out.println("\n------------------------");
		System.out.println("홀수 합 출력 : "+odd);
		System.out.println("------------------------");
		
		for (int i = 0; i < b.length; i++) {
			if ((b[i]%2)==0) {
				even = even+b[i];
			}
			if ((b[i]%2)==1) {
				b[i]=0;
			}
			System.out.print(" "+b[i]);
		}
		System.out.println("\n------------------------");
		System.out.println("짝수 합 출력 : "+even);
		System.out.println("------------------------");
		
	}
	
}
