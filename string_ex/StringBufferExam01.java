package string_ex;

public class StringBufferExam01 {

	public static void main(String[] args) {
		//ȫ�浿 20�� �ش��ϴ� �����͸� ����� 98�� �����Ͻÿ�.
		String data = "�̼���;100;ȫ�浿;20";
		
		StringBuffer sb = new StringBuffer(data);
		
		sb.delete(8, 14);
		sb.insert(8, "�����;98");
		
		String msg = sb.toString();
		System.out.println(msg);
	}
}
