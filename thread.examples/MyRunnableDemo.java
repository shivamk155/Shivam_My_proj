
public class MyRunnableDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread "+ Thread.currentThread().getId() + " is here.");
	}

}
