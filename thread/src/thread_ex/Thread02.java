package thread_ex;

public class Thread02 implements Runnable{

	@Override
	public void run(){
		
		int tot = 0;
		if (Thread.currentThread().getName().equals("첫번째")) {
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
		
		Thread thread = new Thread(obj,"첫번째"); //obj에 run메소드를 넣어줌
		Thread thread2 = new Thread(obj2,"두번째");
		thread.start();
		thread2.start();
	}
}
