package sorting;

import java.sql.Date;
import java.util.*;

public class SortingUsingComparator {
    public static void main(String[] args) {
        Countries india = new Countries("India", 100,
                new GregorianCalendar(2014, Calendar.NOVEMBER, 05).getTime());

        Countries india2 = new Countries("India", 200,
                new GregorianCalendar(2015, Calendar.NOVEMBER, 05).getTime());

        Countries india3 = new Countries("India", 200,
                new GregorianCalendar(2016, Calendar.NOVEMBER, 05).getTime());

        Countries america = new Countries("America", 999,
                new GregorianCalendar(2015, Calendar.NOVEMBER, 05).getTime());

        Countries namibia = new Countries("namibia", 10,
                new GregorianCalendar(2015, Calendar.NOVEMBER, 05).getTime());

        Countries sydney = new Countries("sydney", 30,
                new GregorianCalendar(2015, Calendar.NOVEMBER, 05).getTime());

        List<Countries> list = new ArrayList<Countries>();
        list.add(india);
        list.add(sydney);
        list.add(india3);
        list.add(america);
        list.add(namibia);
        list.add(india2);

        System.out.println(list);
        Collections.sort(list, new AllComparator());
        System.out.println(list);
    }
}
