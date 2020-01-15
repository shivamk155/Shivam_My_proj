package basic.sync.example;

/**
 * 
 * @author shikathuria
 *
 *Basic and good example having 2 learnings.
 * 
 * 1. As soon as you hit start the control will start execute run as well as move onto next line. 2 line 15 and 33 will execute parallely.
 * 
 * 2. Lock applies on an object so 2 threads must share an object(which signifies a resource) between them. Like in here object b. 
 */
public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		System.out.println("line is placed to check the order of execution.......");
		
		synchronized (b) {
			try {
				System.out.println("Waiting for b to complete...");
				b.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is: " + b.total);
		}
	}
}

class ThreadB extends Thread {
	int total;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notify();
		}
	}
}
