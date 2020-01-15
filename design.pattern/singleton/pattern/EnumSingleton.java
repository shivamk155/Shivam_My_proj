package singleton.pattern;

public enum EnumSingleton {
	
	INSTANCE;
	private EnumSingleton(){
		System.out.println("Creating EnumInstance :");
	}
}
