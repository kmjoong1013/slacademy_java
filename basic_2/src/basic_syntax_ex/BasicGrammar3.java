package basic_syntax_ex;

/**
 * 기초문법을 테스트하기 위한 클래스
 * @author Administrator
 *
  */

public class BasicGrammar3 {
	
	/**
	      * 클래스 맴버 변수
	      */
	
	static int a = 10;
	
	/**
	 * 두 개의 정수를 파라미터로 받아 값을 출력하는 메소드
	 * @return  
	 * @param aa
	 * @param bb
	 */
	
	public static void sub(int aa, int bb) {
		// TODO Auto-generated method stub
		System.out.println("a = " + a);
		System.out.println("aa + bb = " + (aa + bb) );
	}
	
	/**
	 * 두 개의 정수를 파라미터로 받아 합계를 리턴
	 * @param aa 첫 번째 정수 파라미터 
	 * @param bb 두번째 정수 파라미터 
	 * @return aa+ bb 값을 리턴 
	 * @see Syntax_ex.BasicGrammar3#sub
	 */
	
	public static int sub2(int aa, int bb) {
		int tot=0;
		tot=aa+bb;
		return tot;
	}
	
	/**
	 * 프로그램의 시작이되는 메소드 
	 * @param args 실행시 명령등을 입력받을 수 있는 값으로 배열로 하나 이상의 데이터가 입력된다. 
	 */
	
	public static void main (String[] args) {
		int a = 20;
		sub(1,2);
		int tot = sub2(10,20);
		System.out.println("tot = " +tot);
	}
}
