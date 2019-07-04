package basic_syntax_ex;

public class op02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 4;
		
		System.out.println("a % b = " + a%b);     // 10 나누기 4 의 나머지 2
		System.out.println("a == b = " + (a==b)); // a와 b가 같냐
		System.out.println("a != b = " + (a!=b)); // a와 b가 같지 않냐
		System.out.println("10 < a && a < 20 = " + (10 < a && a < 20)); //하나라도 같지 않으면 거짓
		System.out.println("(a<b) ? a : b = " +((a<b) ? a : b)); //a와 b의 크기를 비교해서 그 값이 참이면 a값 거짓이면 b값
		System.out.println("a+=b = " + (a+=b)); //a+b란 의미
	}

}
