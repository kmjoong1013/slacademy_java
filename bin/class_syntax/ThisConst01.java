package class_syntax;

public class ThisConst01 {
	public String name;
	public int korScore;
	public int engScore;
	
	//������ 
	public ThisConst01(int korScore,int engScore) {
		this.korScore = korScore;
		this.engScore = engScore;
	}
	
	public ThisConst01(String name, int korScore,int engScore) {
		//�����ڰ� �ٸ� ������ ȣ�� ���� 
		//��ܿ� �ѹ��� �ֱ�
		//Ŭ���� ��� �������ٰ� ���� �������ش�.
		this(korScore,engScore);
		this.name = name;
	}
	
	@Override
	public void finalize() {
		System.out.println("�Ҹ�");
	}
	//�л��� �̸� �������� ���������� �����ϴ� Ŭ���� 
	public static void main(String[] args) {
		ThisConst01 obj = new ThisConst01(10,20);
		ThisConst01 obj2 = new ThisConst01(10,20);
		
		//garbage collection�� ���Ӹ� 
		System.gc();

	}

}
