package singleton.pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonClassPattern s1 = SingletonClassPattern.getInstance();
		SingletonClassPattern s2 = SingletonClassPattern.getInstance();
		SingletonClassPattern s3 = null;
		
		System.out.println("s1 hashcode :"+s1.hashCode());
		System.out.println("s2 hashcode :"+s2.hashCode());
		
		try {
			Constructor cons = SingletonClassPattern.class.getDeclaredConstructor();
			cons.setAccessible(true);
			
			s3 = (SingletonClassPattern)cons.newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
		System.out.println("s3 hashcode :"+s3.hashCode());

		
		
		
		SingletonClassPattern s4 = null;
		try {
			Field f = SingletonClassPattern.class.getDeclaredField("s");
			f.setAccessible(true);
			f.set(f,null);
			
			s4 = SingletonClassPattern.getInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
		System.out.println("s4 hashcode :"+s4.hashCode());
	
		System.out.println(" : ------------------------ :");
		
		//Using Enum
		EnumSingleton singleton = EnumSingleton.INSTANCE;
	    System.out.println(singleton.INSTANCE);
		
		
	}

}
