import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z0-9]*");
		String s = "shivamkathuria@";
		
		Matcher m = p.matcher(s);
		 if(m.matches()){
			 System.out.println("string is matching");
		 }else{
			 System.out.println("string is not matching");
		 }
	}
}
