package basic.sync.example;

public class MyBasicExample {
	static int iter=0;
	public static void main(String[] args) throws InterruptedException {
		final color col = new color();

		// Create a thread object that calls pc.produce()
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while(true){
						Thread.sleep(500);
						col.green();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Create another thread object that calls
		// pc.consume()
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while(true){
						Thread.sleep(500);
						col.red();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		// Start both threads
		t2.start();
		t1.start();
	}

	public static class color {
		public void green() throws InterruptedException {
			synchronized (this) {
				System.out.println("GREEN");
				notify();
				wait();
			}
		}

		public void red() throws InterruptedException {
			Thread.sleep(1000);
			synchronized (this) {
				System.out.println("RED");
				notify();
				wait();
			}
		}
	}
}