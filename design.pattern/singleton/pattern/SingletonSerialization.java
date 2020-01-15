package singleton.pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerialization {
	
	public static void main(String[] args)  
    { 
		SingletonClassPattern os = SingletonClassPattern.getInstance();
		System.out.println("os hashcode :"+os.hashCode());
		try {
			ObjectOutput o = new ObjectOutputStream(new FileOutputStream("file.txt"));
			o.writeObject(os);
			o.close();

			ObjectInput i = new ObjectInputStream(new FileInputStream("file.txt"));
			SingletonClassPattern is = (SingletonClassPattern)i.readObject();
			i.close();
			
			System.out.println("os hashcode :"+os.hashCode());
			System.out.println("is hashcode :"+is.hashCode());
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
		
		
    }
}
