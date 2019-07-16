package thread_ex;

	class Thread_Ex4 extends Thread {
		public Thread_Ex4(String name) {
		super(name);
		}
		public void run() {
			System.out.println(getName()+ " 스레드");
		}
}

public class Thread05_Priority {

	public static void main(String[] str) {
		Thread_Ex4 obj1 = new Thread_Ex4("최고 우선 순위");
		Thread_Ex4 obj2 = new Thread_Ex4("보통 우선 순위");
		Thread_Ex4 obj3 = new Thread_Ex4("최저 우선 순위");
		
		obj1.setPriority(Thread.MAX_PRIORITY);  // 최고 우선 순위
		obj2.setPriority(Thread.NORM_PRIORITY); // 보통 우선 순위
		obj3.setPriority(Thread.MIN_PRIORITY);  // 최저 우선 순위
		
		obj3.start();
		obj2.start();
		obj1.start();
	}
}
