import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubstringLexicalSorting {

//In 
	public static void main(String[] args) {
		String s = "aabbcde";
		System.out.println("here is POC --> "+s.substring(0,0));
		System.out.println("here is POC --> "+s.substring(1));
		//Set<String> hashSet = new HashSet<String>();
		List<String> hashSet = new ArrayList<String>();
		
		for(int i=1; i< s.length(); i++){

			for(int j=0;j<s.length();j=j+1){
				if((j+i) >= s.length()){
					hashSet.add(s.substring(j));
				}else{
					hashSet.add(s.substring(j,j+i));
				}
			}
		}
		List l = new ArrayList(hashSet);
		Collections.sort(l);
		System.out.println("Lexical"+l.toString());
		lexicographicSubConcat(s);
	}
	
	static void lexicographicSubConcat(String s) 
	{ 
	    int n = s.length(); 
	  
	    // Creating an array to store substrings 
	    int sub_count = n*(n+1)/2; 
	    String []arr = new String[sub_count];      
	  
	    // finding all substrings of string 
	    int index = 0; 
	    for (int i = 0; i < n; i++)  
	        for (int len = 1; len <= n - i; len++)  
	        { 
	                arr[index++] = s.substring(i, i+len); 
	        } 
	    // Sort all substrings in lexicographic 
	    // order 
	    Arrays.sort(arr);  
	  
	    // Concatenating all substrings 
	    String res = ""; 
	    System.out.println("Lexical--");
	    for (int i = 0; i < sub_count; i++)  
	    	System.out.println(arr[i]);
	} 
	
}



