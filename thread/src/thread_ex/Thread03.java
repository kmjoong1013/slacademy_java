package thread_ex;

public class Thread03 extends Thread{
	private int[] temp;
	public Thread03(String threadname) {
		super(threadname);
		temp = new int[10];
		for (int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
	}
	public void run() {
		for(int start : temp) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				 e.printStackTrace();
			}
			//System.out.printf("스레드 이름  : %s", currentThread().getName());
			System.out.printf("%s temp value  : %d %n", currentThread().getName(), start);
		}
	}
	public static void main(String[] args) {
		Thread03 st = new Thread03("첫번째");
		Thread03 st2 = new Thread03("두번째");
		Thread03 st3 = new Thread03("세번째");
		st.start();
		st2.start();
		st3.start();
	}
}
