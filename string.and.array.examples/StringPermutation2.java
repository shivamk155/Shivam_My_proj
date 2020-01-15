public class StringPermutation2 {

	public static void main(String[] args) {
		String s = "abcde";
		permCombination(s,"");
	}

	static void permCombination(String s, String ans) {

		if (s.length() == 0){
			System.out.println(ans + " ");
			return;
		}	

		for (int i = 0; i < s.length(); i++) {
			char firstChar = s.charAt(i);
			
			String remainingChar = s.substring(0,i) + s.substring(i+1);
			
			permCombination(remainingChar,ans+firstChar);
		}

	}
}
