public class NewNumber {
    int oldNumber;
    long newNumber;

    public int getOldNumber() {
        return oldNumber;
    }

    @Override
    public String toString() {
        return String.valueOf(oldNumber);
    }

    public NewNumber(int oldNumber, int size) {
        this.oldNumber = oldNumber;
        String s = Integer.toString(oldNumber);
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        while (ans.length() <= size + 1)
            ans.append(sb);

        s = ans.toString().substring(0, size + 1);
        this.newNumber = Long.parseLong(s);
    }

    public long getNewNumber() {
        return newNumber;
    }

}

