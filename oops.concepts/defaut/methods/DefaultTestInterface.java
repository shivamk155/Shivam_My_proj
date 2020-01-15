package defaut.methods;

public interface DefaultTestInterface {
	
	public void a();
	
	public void b(int i);
	
	public default void special(long l){
		System.out.println("Hey this is default method");
	}
}
