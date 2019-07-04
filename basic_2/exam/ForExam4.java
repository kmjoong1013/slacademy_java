package basic_syntax_ex.exam;

public class ForExam4 {
	public static void main(String[] args) {
		// 알파벳을 X부터 E까지 for문으로 출력하고 
		// K일 경우 '대한민국 만세~'를 출력하시오
		
		for (char i = 'X'; i >= 'E'; i--) {
			if(i=='K') {
				System.out.print(" 대한민국 만세~");
			}else {
				System.out.print(" "+i);
			}
			
		}
	}
}
