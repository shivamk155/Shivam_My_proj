
public class ThreadClassDemo extends Thread {
	
	AlterDemo altDm;
	
	ThreadClassDemo(AlterDemo altDm){
		this.altDm=altDm;
	}
	
	public void run(){
		while(true){
		try {
			altDm.printAlterNum();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
