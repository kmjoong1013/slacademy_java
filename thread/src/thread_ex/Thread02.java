package thread_ex;

public class Thread02 implements Runnable{

	@Override
	public void run(){
		
		int tot = 0;
		if (Thread.currentThread().getName().equals("ù��°")) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println(Thread.currentThread().getName());
			}
		}else {
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		Thread02 obj = new Thread02();
		Thread02 obj2 = new Thread02();
		
		Thread thread = new Thread(obj,"ù��°"); //obj�� run�޼ҵ带 �־���
		Thread thread2 = new Thread(obj2,"�ι�°");
		thread.start();
		thread2.start();
	}
}
