public class VowelSubsequence {
    public static void main(String[] args) {

        String sequence = "aaejkioou";
        String subSequence = "aeiou";
        int subSequenceIndex = 0;

        int length = 0;
        char lastChar = Character.MIN_VALUE;

        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == lastChar) {
                length++;
            } else if (sequence.charAt(i) == subSequence.charAt(subSequenceIndex)) {
                subSequenceIndex++;
                length++;
                lastChar = sequence.charAt(i);
            }

            //Here is a bug, which can be corrected easily: "aaejkioouuuuuu";
            if (subSequenceIndex == subSequence.length())
                break;
        }

        if (subSequenceIndex == subSequence.length()) {
            System.out.println("Sequence contains all vowels in subsequence: " + length);
        } else
            System.out.println("Sequence does NOT contains all vowels in subsequence.");

    }
}
