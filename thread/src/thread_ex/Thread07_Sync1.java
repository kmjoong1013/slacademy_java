package thread_ex;
class LogicThread extends Thread{
	Thread07_Sync1 logicObj;
	int cnt;
	String name;
	
	LogicThread(Thread07_Sync1 logicObj, int cnt, String name){
		this.logicObj = logicObj;
		this.cnt = cnt;
		this.name = name;
	}
	public void run(){
		for(int i=0;i<cnt;i++){
			System.out.println(name+"�� add()���� �õ�");
			logicObj.add(name,-10);
		}
	}
}
////////////////////////////////////////
public class Thread07_Sync1 extends Thread{
	int data;
	
	public synchronized void add(String name, int iAdd){
		System.out.print(name+"�� ����ȭ ������ ������ "+data);
		data = data + iAdd;
		System.out.println("�� "+data+"�� ������ ");   
		try{
			sleep(3000);
		}catch(Exception e){
			System.out.println("sleep exception �߻�");
		}
	}
	
	public static void main(String[] args) {
		Thread07_Sync1 logic = new Thread07_Sync1();
		
		LogicThread thread1 = new LogicThread(logic, 2,"Thread1");
		LogicThread thread2 = new LogicThread(logic, 2,"Thread2");
		
		thread1.start();
		thread2.start();
	}
}
