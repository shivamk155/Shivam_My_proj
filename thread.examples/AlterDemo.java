
public class AlterDemo {

	void printAlterNum() throws InterruptedException{
		synchronized(this){
			System.out.println("Thread "+Thread.currentThread().getId() + " is in 1st block." );
			System.out.println("All thread notified");
			Thread.sleep(1000);
		}
	}
}
