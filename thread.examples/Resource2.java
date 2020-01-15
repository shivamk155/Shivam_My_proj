
public class Resource2 {
	int a = 0;

	public synchronized void addMoney() {
		System.out.println("In Add Money method");
	}

	public void subtractMoney() {
		synchronized(Resource2.class){
			System.out.println("In Subtract Money method");
		}
	}

}
