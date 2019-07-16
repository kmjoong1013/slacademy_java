package thread_ex;

public class Thread01 extends Thread{

	public Thread01(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(getName()+"실행...");
	}
	
	public static void main(String[] args) {
		Thread01 thread1 = new Thread01("첫번째 thread");
		Thread01 thread2 = new Thread01("두번째 thread");
		thread1.start();
		thread2.start();
	}
}
