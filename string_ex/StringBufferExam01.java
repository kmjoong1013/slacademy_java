package string_ex;

public class StringBufferExam01 {

	public static void main(String[] args) {
		//홍길동 20에 해당하는 데이터를 정약용 98로 변경하시오.
		String data = "이순신;100;홍길동;20";
		
		StringBuffer sb = new StringBuffer(data);
		
		sb.delete(8, 14);
		sb.insert(8, "정약용;98");
		
		String msg = sb.toString();
		System.out.println(msg);
	}
}
