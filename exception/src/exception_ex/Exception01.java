package exception_ex;

public class Exception01 {

	public static void main(String[] args) {
		int a[] = new int [5];
		for (int i = 0; i < a.length; i++) {
			try {
				a[i] = i;
			} catch (Exception e) {
				System.out.println("�迭 ������ ���� �����ϴ�.");
				System.out.println(e.getMessage());
			}
		}
	}
}
