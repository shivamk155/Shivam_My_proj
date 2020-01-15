
public class SmallDeadlock {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("I am in main thread");
		
			Thread.currentThread().join();
		
		System.out.println("exiting main thread");
	}

}
