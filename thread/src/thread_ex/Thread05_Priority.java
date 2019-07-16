package thread_ex;

	class Thread_Ex4 extends Thread {
		public Thread_Ex4(String name) {
		super(name);
		}
		public void run() {
			System.out.println(getName()+ " ������");
		}
}

public class Thread05_Priority {

	public static void main(String[] str) {
		Thread_Ex4 obj1 = new Thread_Ex4("�ְ� �켱 ����");
		Thread_Ex4 obj2 = new Thread_Ex4("���� �켱 ����");
		Thread_Ex4 obj3 = new Thread_Ex4("���� �켱 ����");
		
		obj1.setPriority(Thread.MAX_PRIORITY);  // �ְ� �켱 ����
		obj2.setPriority(Thread.NORM_PRIORITY); // ���� �켱 ����
		obj3.setPriority(Thread.MIN_PRIORITY);  // ���� �켱 ����
		
		obj3.start();
		obj2.start();
		obj1.start();
	}
}
