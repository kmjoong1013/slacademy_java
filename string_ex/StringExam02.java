package string_ex;

import java.util.Scanner;

public class StringExam02 {

	public static void main(String[] args) {
		/* 키보드로 YYYYMMDD 에 해당하는 데이터를 문자열로 입력 받아
		 * 입력받은 문자열의 길이가 8자가 넘으면 오류 메세지 출력 8자 이하면 아래 내용 처리 
		 * 0000년 00월 00일 이라고 출력하고 
		 * 3월에서 5월이면 봄
		 * 6월에서 8월이면 여름
		 * 9월에서 11월 이면 가을
		 * 12월에서 2월이면 겨울이라고 출력 하시오.
		 * 20190301
		 */
		/*char dst[] = new char[8];
		String YYYY;
		String MM;
		String DD;
		
		Scanner in = new Scanner(System.in);
		System.out.print("YYYY입력 : ");
		YYYY = in.next();
		System.out.print("MM입력 : ");
		MM = in.next();
		System.out.print("DD입력 : ");
		DD = in.next();

		System.out.println(YYYY+"년 "+MM+"월 "+DD+"일");
		int MM1 = new Integer(MM);
		if (MM1>=3 && MM1<=5) {
			System.out.println("봄");
		}else if(MM1>=6 && MM1<=8){
			System.out.println("여름");
		}else if(MM1>=9 && MM1<=11){
			System.out.println("가을");
		}else{
			System.out.println("겨울");
		}*/
		
		Scanner in = new Scanner(System.in);
		System.out.println("YYYYMMDD");
		String ymd = in.next();
		if (ymd.length()>8) {
			System.out.println("8자 이상입니다");
			return;
		}
		String yearStr = ymd.substring(0,4);
		String monthStr = ymd.substring(4,6);
		String dateStr = ymd.substring(6);
		System.out.println(yearStr+"년 " + monthStr+"월 " + dateStr+"일");
		
		int month = Integer.parseInt(monthStr);
		if (month>=3 && month<=5) {
			System.out.println("봄");
		}else if(month>=6 && month<=8){
			System.out.println("여름");
		}else if(month>=9 && month<=11){
			System.out.println("가을");
		}else{
			System.out.println("겨울");
		}
	}
}
