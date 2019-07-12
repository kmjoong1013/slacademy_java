package string_ex;

public class StringExam03 {

	public static void main(String[] args) {
		/*
		 String data = "이순신;100;강감찬;98";
		 
		 문자열 data에서 ; 에 해당하는 위치를 변수로 계산해서 이름과 점수를 분리하고
		 점수의 합계를 계산해서 아래와 같이 출력하시오.(for문 사용)
		 
		 이순신 : 100
		 강감찬 : 98
		 합계 : 198
		 */
		String data = "이순신;100;강감찬;98";
		int pos = 0; int pos2 = 0;
		int sum = 0; int startIndex = 0;
		
		while (true) {
			pos = data.indexOf(";",startIndex);
			pos2 = data.indexOf(";",pos+1);
			
			String name = data.substring(startIndex, pos);
			
			String scoreStr = "";
			if (pos2 == -1 ) {
				scoreStr = data.substring(pos+1);
			}else {
				scoreStr = data.substring(pos+1, pos2);
			}
			int score = Integer.parseInt(scoreStr);
			sum = sum + score;
			 System.out.println(name+":"+score);
			 startIndex = pos2+1;
			 
			 if(pos == -1 || pos2 == -1 ) {
				 break;
			 }
			
		}System.out.println("합계:"+ sum);
	}
}
