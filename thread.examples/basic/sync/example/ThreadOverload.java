package basic.sync.example;

public class ThreadOverload {
	
	    public static void main(String[] args) 
	    { 
	        //Here we are using Anonymous Inner class 
	        //that define inside argument, here constructor argument 
	        //Thread t = new Thread(){
	    	new Thread(){
	         
	            public void run() 
	            { 
	                System.out.println("Child Thread"); 
	            } 
	        }.start(); 
	        //t.start(); 
	        System.out.println("Main Thread"); 
	    } 
	} 
