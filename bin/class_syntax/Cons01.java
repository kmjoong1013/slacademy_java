package class_syntax;

public class Cons01 {
	
	private String code; //��ǰ�ڵ�
	private String name;//��ǰ��
	private int price;//�ܰ�
	
	public Cons01() {
		System.out.println("Const01() ������ ȣ��");
	}
	public Cons01(String code) {
		this.code=code;
		System.out.println("code:"+code);
	}
	public Cons01(String code, String name, int price ) {
		this.code=code;
		this.name=name;
		this.price=price;
		prn();
	}
	public void prn() {
		System.out.println("==================");
		System.out.println("��ǰ�ڵ�:"+code);
		System.out.println("��ǰ��:"+name);
		System.out.println("��ǰ�ܰ�:"+price);
		
	}
}
