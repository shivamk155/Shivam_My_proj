
public class ThreadCaller {

	public static void main(String[] args) throws InterruptedException {
		Resource2 r2 = new Resource2();
		Thread t1 = new Thread(new ThreadRunner(1, r2));
		Thread t2 = new Thread(new ThreadRunner(2, r2));

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}
}
