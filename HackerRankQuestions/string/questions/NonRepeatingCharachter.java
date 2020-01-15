package string.questions;

public class NonRepeatingCharachter {

	public static void main(String args[]) {

		int x = 10;
		int z = 20;
		
		int totalCount = 0;

		int n = 2;

		for (int i = x; i <= z; i++) {
			if (checkIfNonRepeating(i, n * i)) {
				totalCount++;
			}
		}
		System.out.println("Count of total numbers applicable:" + totalCount);
	}

	public static boolean checkIfNonRepeating(int currNum, long prod) {

		String s1 = String.valueOf(prod);
		String s2 = String.valueOf(currNum);

		for (int i = 0; i < s2.length(); i++) {
			if (s1.contains(String.valueOf(s2.charAt(i)))) {
				System.out.println(s1 + "------" + s2.charAt(i));
				return true;
			}
		}

		return false;
	}

}
