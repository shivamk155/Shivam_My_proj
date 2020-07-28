public class CountIndex {
    int firstIndex, frequency;

    public CountIndex(int index) {
        firstIndex = index;
        frequency = 1;
    }

    public void incCount() {
        this.frequency++;
    }
}
