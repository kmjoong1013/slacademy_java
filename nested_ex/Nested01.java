package nested_ex;
//��øŬ����(nested class)

class AA{
	static class BB{
	static int bb = 20;
	void sub(){
		
	}
	static class CC{
		int cc = bb + 10;
	}
	static BB obj = new BB();
	}
}


public class Nested01 {

	public static void main(String[] args) {
		AA.BB.CC c = new AA.BB.CC();
		AA objA = new AA();
		AA.BB objB = new AA.BB();
		System.out.println("objB.bb = "+objB.bb);
		System.out.println("CCŬ���� ���� ���� cc = " + c.cc);
	}
}
