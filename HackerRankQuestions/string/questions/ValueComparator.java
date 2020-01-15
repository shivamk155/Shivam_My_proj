package string.questions;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return (((Map.Entry<String, Integer>)o1).getValue() - ((Map.Entry<String, Integer>)o2).getValue());  
	}

}
