package class_syntax;

public class Static01Exe {

	public static void main(String[] args) {
		
		
		Static01.sprn();
		System.out.println(Static01.X_POS); //static member ����
		
		Static01 obj = new Static01(); //Ŭ���� ���� �����ϰ� ��ü�� ���� 
		Static01 obj2 = new Static01(); 
		System.out.println(obj.x); 
		
		obj.x =100;
		obj2.x =200;
		System.out.println("obj.x :" + obj.x);
		System.out.println("obj.x :" + obj2.x);
		
		Static01.X_POS =700;
		
		//�� ���� �� 
		System.out.println(Static01.X_POS); //static member ����
		System.out.println(obj.X_POS); //static member ����
		System.out.println(obj2.X_POS); //static member ����
	
		
		Static01.sprn();
		//Ŭ���� �� �޼ҵ� ���̴� ���� �� ��õ 
		//obj.sprn();
		//obj2.sprn();
	}

}
