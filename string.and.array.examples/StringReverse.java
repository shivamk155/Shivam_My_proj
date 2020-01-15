

//Method to reverse the string keeping special charachters at the samr place.
public class StringReverse {

	public static void main(String[] args) {
		String s = "shiv@m";
		char revrsedStrArr[] = new char[s.length()];

		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if ("@,#;%$^&*)(".contains(String.valueOf(s.charAt(i)))) {
				revrsedStrArr[i] = s.charAt(i);

			} else {
				if ("@,#;%$^&*)(".contains(String.valueOf(revrsedStrArr[j]))) {
					j++;
					revrsedStrArr[j] = s.charAt(i);
				} else {
					revrsedStrArr[j] = s.charAt(i);
				}
				j++;
			}
		}
		System.out.println(revrsedStrArr);
	}

}
