package thread_ex;

public class Thread01 extends Thread{

	public Thread01(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(getName()+"����...");
	}
	
	public static void main(String[] args) {
		Thread01 thread1 = new Thread01("ù��° thread");
		Thread01 thread2 = new Thread01("�ι�° thread");
		thread1.start();
		thread2.start();
	}
}
