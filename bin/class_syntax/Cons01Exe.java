package class_syntax;

public class Cons01Exe {

	public static void main(String[] args) {
		//Cons01 obj = new Cons01();
		//Cons01 obj = new Cons01("A-100");
		//Cons01 obj2 = new Cons01("B-100");
		//Cons01 obj = new Cons01("A-100","따듯해냉장고",120000);
		//Cons01 obj2 = new Cons01("B-100","미지근해냉장고",140000);
		//클래스의 배열(초기값을 부여하면서 생성 )
		/*Cons01 goods[] = new Cons01[] {new Cons01("A-100","따듯해냉장고",120000),
				new Cons01("B-100","미지근해냉장고",140000),
				new Cons01("B-100","시원해냉장고",210000)
		};*/
		//클래스의 배열
		Cons01 goods[] = new Cons01[3];
		for (int i = 0; i < goods.length; i++) {
			goods[i] = new Cons01("A-100","따듯해냉장고",120000);//실제로는 db에서 서로 다른값을 읽어서 생성
		}
	}
}

