package sorting;

import java.util.Comparator;

public class GDPComparator implements Comparator<Countries> {
    public int compare(Countries c1, Countries c2) {
        return c1.getGdp() - c2.getGdp();
    }
}


