package class_syntax;

public class Cons01Exe {

	public static void main(String[] args) {
		//Cons01 obj = new Cons01();
		//Cons01 obj = new Cons01("A-100");
		//Cons01 obj2 = new Cons01("B-100");
		//Cons01 obj = new Cons01("A-100","�����س����",120000);
		//Cons01 obj2 = new Cons01("B-100","�������س����",140000);
		//Ŭ������ �迭(�ʱⰪ�� �ο��ϸ鼭 ���� )
		/*Cons01 goods[] = new Cons01[] {new Cons01("A-100","�����س����",120000),
				new Cons01("B-100","�������س����",140000),
				new Cons01("B-100","�ÿ��س����",210000)
		};*/
		//Ŭ������ �迭
		Cons01 goods[] = new Cons01[3];
		for (int i = 0; i < goods.length; i++) {
			goods[i] = new Cons01("A-100","�����س����",120000);//�����δ� db���� ���� �ٸ����� �о ����
		}
	}
}

