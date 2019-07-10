package class_syntax;

public class Static01Exe {

	public static void main(String[] args) {
		
		
		Static01.sprn();
		System.out.println(Static01.X_POS); //static member 변수
		
		Static01 obj = new Static01(); //클래스 명을 정의하고 객체로 정의 
		Static01 obj2 = new Static01(); 
		System.out.println(obj.x); 
		
		obj.x =100;
		obj2.x =200;
		System.out.println("obj.x :" + obj.x);
		System.out.println("obj.x :" + obj2.x);
		
		Static01.X_POS =700;
		
		//다 같은 값 
		System.out.println(Static01.X_POS); //static member 변수
		System.out.println(obj.X_POS); //static member 변수
		System.out.println(obj2.X_POS); //static member 변수
	
		
		Static01.sprn();
		//클래스 명에 메소드 붙이는 것을 더 추천 
		//obj.sprn();
		//obj2.sprn();
	}

}
