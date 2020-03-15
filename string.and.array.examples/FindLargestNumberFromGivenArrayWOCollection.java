import java.util.*;

public class FindLargestNumberFromGivenArrayWOCollection {
    public static void main(String[] args) {
        Integer[] arr = {1, 34, 3, 98, 9, 76, 45, 4, 12, 121};

        System.out.println(Arrays.toString(arr));

        int size = Collections.max(Arrays.asList(arr)).toString().length();
        List<NewNumber> list = new ArrayList<NewNumber>(arr.length);
        for (int i = 0; i < arr.length; i++)
            list.add(new NewNumber(arr[i], size));

        Collections.sort(list, new Comparator<NewNumber>() {
            @Override
            public int compare(NewNumber o1, NewNumber o2) {
                if (o2.getNewNumber() > o1.getNewNumber()) {
                    return 1;
                } else
                    return -1;
            }
        });


        System.out.println(list);
    }
}



