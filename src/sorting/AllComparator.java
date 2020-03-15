package sorting;

import java.util.Comparator;

//The idea is that comapre should return +1 if c1 > c2 else -1 or 0
public class AllComparator implements Comparator<Countries> {
    public int compare(Countries c1, Countries c2) {
        if (c1.getName().equalsIgnoreCase(c2.getName())) {
            if (c2.getGdp() == c2.getGdp()) {
                return c1.getBirthDate().compareTo(c2.getBirthDate());
            } else
                return c1.getGdp()- c2.getGdp();
        } else {
            return c1.getName().compareTo(c2.getName());
        }
    }
}