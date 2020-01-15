
public class ThreadRunner implements Runnable {
	private int maxRuns;
	Resource2 r2;

	public ThreadRunner(int maxRuns, Resource2 r2) {
		this.maxRuns = maxRuns;
		this.r2 = r2;
	}

	@Override
	public void run() {

		if (maxRuns == 1) {
			r2.addMoney();
		} else if (maxRuns == 2) {
			r2.subtractMoney();
			//Resource2.subtractMoney();
		}
	}
}
