package string_ex;

public class StringBuffer01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("kim");
		System.out.println("�ʱ�  ���� ũ�� : " + sb.length()); // ���ڿ� ����
		System.out.println("�ʱ� ���� ũ�� :" + sb.capacity()); // ���� ������
		sb.append("hello");
		sb.insert(3,"~~~");
		System.out.println(sb);
		System.out.println("���� ũ�� : " + sb.length()); // ���ڿ� ����
		System.out.println("���� ũ�� :" + sb.capacity()); // ���� ������ 
	}
}
