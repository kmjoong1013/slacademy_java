package thread_ex;

public class Thread04 implements Runnable {
	private int[] temp;     
	public Thread04(){
		temp = new int[10];   
		for(int start=0;start<temp.length;start++){  
			temp[start] = start;     
		}
	}
	@Override
	public void run(){
		for(int start : temp){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			//System.out.printf("스레드 이름  : %s", Thread.currentThread().getName());
			System.out.printf("%s temp value  : %d %n", Thread.currentThread().getName(), start);
		}
	}
	public static void main(String[] args) {
		Thread04 st = new Thread04();
		Thread04 st2 = new Thread04();
		Thread04 st3 = new Thread04();
		
		Thread t = new Thread(st,"첫번째");
		Thread t2 = new Thread(st2,"두번째");
		Thread t3 = new Thread(st3,"세번째");
		
		t.start();
		t2.start();
		t3.start();
	}
}
