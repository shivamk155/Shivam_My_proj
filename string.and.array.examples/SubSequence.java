public class SubSequence {
    public static void main(String[] args) {
        String sequence = "1346846465";
        String subSequence = "186";

        int subindex = 0;
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == subSequence.charAt(subindex))
                subindex++;

            if (subindex == subSequence.length())
                break;

        }

        if (subindex == subSequence.length())
            System.out.println("Subsequence is there.");
        else
            System.out.println("Subsequence is not there.");

    }
}
