package revision;

import java.util.HashMap;
import java.util.Map;

public class WinnerOfAnElection {
    public static void main(String[] args) {
        String[] votes = {
                "john", "johnny", "jackie",
                "johnny", "john", "jackie",
                "jamie", "jamie", "john",
                "johnny", "jamie", "johnny",
                "john"};

        Map<String, Integer> map = new HashMap<>();

        for (String str : votes) {
            if (!map.containsKey(str))
                map.put(str, 1);
            else
                map.put(str, map.get(str) + 1);
        }

        int maxVoteCount = Integer.MIN_VALUE;
        String winner = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxVoteCount) {
                maxVoteCount = entry.getValue();
                winner = entry.getKey();
            } else if (entry.getValue() == maxVoteCount && entry.getKey().compareTo(winner) < 0) {
                winner = entry.getKey();
            }
        }

        System.out.println("The winner of the voting is: " + winner + ", with votes: " + maxVoteCount);
    }
}
