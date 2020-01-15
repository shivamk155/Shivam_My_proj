package string.questions;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class SortingByValueInMap {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("Bhuvan", 2);
		m.put("Ram", 18);
		m.put("Aam", 1);
		m.put("Zebra", 26);

		out.println(m.toString());

		orderHashMap(m);

	}

	public static void orderHashMap(Map<String, Integer> m) {
		List<Map.Entry<String, Integer>> list = new ArrayList(m.entrySet());
		Collections.sort(list, new ValueComparator());
		
		out.println(list.toString());
	}

}
