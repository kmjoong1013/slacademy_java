package thread_ex;

class ATM implements Runnable{
	private long depositeMoney = 10000;
	public long getDepositeMoney(){
		return depositeMoney;
	}
	public void run(){
		synchronized(this){
			for(int i=0;i<10;i++){
				if(getDepositeMoney()<=0) break;
				withDraw(1000);
				if(getDepositeMoney()==2000 ||
						getDepositeMoney()==4000 ||
						getDepositeMoney()==6000 ||
						getDepositeMoney()==8000 ){
					try {
						System.out.println(Thread.currentThread().getName() + " wait");
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();//
					}
				}else{
						System.out.println(Thread.currentThread().getName() + " notify");
						this.notify();
					}
				}
			}
		}
	
		public void withDraw(long howMuch){
			if(getDepositeMoney() >0){
				depositeMoney -= howMuch;
				System.out.print(Thread.currentThread().getName()+" , ");
				System.out.printf("�ܾ� : %,d �� %n",getDepositeMoney());
			}else{
				System.out.print(Thread.currentThread().getName()+" , ");
				System.out.println("�ܾ��� �����մϴ�.");
			}
		}
	}
	public class Thread06_WaitNotify {
		public void main(String[] args){
			ATM atm = new ATM();
			Thread mother = new Thread(atm,"mother");
			Thread son = new Thread(atm,"son");
			mother.start();
			son.start();
		}
	}



