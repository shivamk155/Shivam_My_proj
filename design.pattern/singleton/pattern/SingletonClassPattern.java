package singleton.pattern;

import java.io.Serializable;

public class SingletonClassPattern implements Serializable{
	
	private static SingletonClassPattern s;
	
	private SingletonClassPattern(){
		if(null != s){
			System.out.println("Illegal attempt of creating instance :");
		}
		
	}
	
	public static SingletonClassPattern getInstance(){
		
		if(null == s){
			synchronized(SingletonClassPattern.class){
				if(null == s){
					s = new SingletonClassPattern();
				}
			}
		}	
	return s;
	}
	
	protected Object readResolve(){
		return s;
	}
	
	
}
