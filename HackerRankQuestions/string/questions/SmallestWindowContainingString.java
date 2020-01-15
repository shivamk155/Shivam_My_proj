package string.questions;

public class SmallestWindowContainingString {

	static final int no_of_chars = 256;

	public static void main(String[] args) {
		findSubString("GeeksForGeeks", "orrk");
	}

	static void findSubString(String str, String pat) {
		int len1 = str.length();
		int len2 = pat.length();

		int hash_pat[] = new int[no_of_chars];
		int hash_str[] = new int[no_of_chars];

		// store occurrence ofs characters of pattern
		for (int i = 0; i < len2; i++)
			hash_pat[pat.charAt(i)]++;

		System.out.println("value of hash pattern");
		System.out.println(String.valueOf(hash_pat));
	}
}
