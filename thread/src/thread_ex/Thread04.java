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
			//System.out.printf("������ �̸�  : %s", Thread.currentThread().getName());
			System.out.printf("%s temp value  : %d %n", Thread.currentThread().getName(), start);
		}
	}
	public static void main(String[] args) {
		Thread04 st = new Thread04();
		Thread04 st2 = new Thread04();
		Thread04 st3 = new Thread04();
		
		Thread t = new Thread(st,"ù��°");
		Thread t2 = new Thread(st2,"�ι�°");
		Thread t3 = new Thread(st3,"����°");
		
		t.start();
		t2.start();
		t3.start();
	}
}
