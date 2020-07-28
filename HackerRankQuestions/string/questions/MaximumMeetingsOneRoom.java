package string.questions;

import java.util.*;

//This question is a typical example of greedy algorithm
public class MaximumMeetingsOneRoom {

	public static void main(String[] args) {
		int[] s = { 12, 2, 3, 4, 7, 8, 9, 9, 11, 1 };
		int[] f = { 14, 5, 4, 7, 10, 9, 11, 13, 12, 3 };

		Map<Integer, Integer> treeMap = new TreeMap<>();
		for (int i = 0; i < s.length; i++) {
			treeMap.put(f[i], s[i]);
		}

		// {3=1, 4=3, 5=2, 7=4, 9=8, 10=7, 11=9, 12=11, 13=9, 14=12}
		Set<Integer> set = treeMap.keySet();

		int j = 0;
		List<Integer> list = new LinkedList<>();
		for (Integer i : set) {
			if (j == 0)
				list.add(i);
			else if (!checkIfOverlapping(list.get(list.size() - 1), treeMap.get(i)))
				list.add(i);

			j++;
		}
		
		System.out.println(list.toString());
	}

	public static boolean checkIfOverlapping(Integer lastAddedMeeting, Integer startingTimeOfCurrMeeting) {
		return lastAddedMeeting > startingTimeOfCurrMeeting;
	}
}
