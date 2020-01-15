package defaut.methods;

public class DefaultImplementClass implements DefaultTestInterface {

	@Override
	public void a() {
	}

	@Override
	public void b(int i) {
	}
	
	public void special(long l){
		System.out.println("Hey this is default method");
	}


}
