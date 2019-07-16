package exception_ex;

public class Exception02 {

	public static void main(String[] args) {
		int arr[] = {2,3,5,0,9};
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			
			try {
				result = 10/arr[i];
			} catch (ArithmeticException e) {
				System.out.println("������");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("�迭����");
			}
			finally {
				System.out.println("i="+i+" result="+result);
			}
		}
	}
}
