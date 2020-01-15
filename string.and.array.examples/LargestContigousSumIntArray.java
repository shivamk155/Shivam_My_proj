import static java.lang.System.out;

//This code is an example of Kaidene's algorithm for fining the largest possible conitgous sum
//it has 2 points
//Maintain 2 parameters
//One to store max sum so far
//Second to store the current sum
public class LargestContigousSumIntArray {

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		int max_so_far = Integer.MIN_VALUE;
		int max_ending_value = 0;

		for (int i = 0; i < arr.length; i++) {
			max_ending_value = max_ending_value + arr[i];

			if (max_ending_value < 0)
				max_ending_value = 0;

			if (max_so_far < max_ending_value)
				max_so_far = max_ending_value;
		}

		out.println(max_so_far);
	}

}
