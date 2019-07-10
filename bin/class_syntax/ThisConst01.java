package class_syntax;

public class ThisConst01 {
	public String name;
	public int korScore;
	public int engScore;
	
	//생성자 
	public ThisConst01(int korScore,int engScore) {
		this.korScore = korScore;
		this.engScore = engScore;
	}
	
	public ThisConst01(String name, int korScore,int engScore) {
		//생성자가 다른 생성자 호출 가능 
		//상단에 한번만 넣기
		//클래스 멤버 변수에다가 값을 저장해준다.
		this(korScore,engScore);
		this.name = name;
	}
	
	@Override
	public void finalize() {
		System.out.println("소멸");
	}
	//학생의 이름 국어점수 영어점수를 저장하는 클래스 
	public static void main(String[] args) {
		ThisConst01 obj = new ThisConst01(10,20);
		ThisConst01 obj2 = new ThisConst01(10,20);
		
		//garbage collection의 줄임말 
		System.gc();

	}

}
