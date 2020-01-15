import java.util.Arrays;

public class ElementsHavingSameSum {

	public static void main(String[] args) {

		int numArr[] = { 3, 9, 8, 4, 5, 7, 10 };
		int k = 15;

		// int numArr[] = { 1, 3, 2};
		// int k = 3;

		System.out.println("list of numbers having same sum:");
		printSameSumCombination(numArr, k, new int[0]);
	}

	static void printSameSumCombination(int numArr[], int sum, int current[]) {

		if (sum < 0)
			return;

		if (sum == 0) {
			System.out.println(Arrays.toString(current));
			return;
		}

		for (int i = 0; i < numArr.length; i++) {
			int newSum = sum - numArr[i];

			// Method to give unique combinations
			printSameSumCombination(popArray(numArr, i), newSum, pushElementintoArray(current, numArr[i]));

			// Method to print all permutations giving this sum
			// printSameSumCombination(popElementFromArray(numArr,numArr[i]) ,newSum , pushElementintoArray(current,numArr[i]));
		}
	}

	static int[] pushElementintoArray(int arr[], int e) {
		int newArr[] = new int[arr.length + 1];

		int j = 0;
		while (j < arr.length) {
			newArr[j] = arr[j];
			j++;
		}

		newArr[j] = e;
		return newArr;
	}

	static int[] popElementFromArray(int arr[], int e) {
		int newArr[] = new int[arr.length - 1];

		int j = 0;
		int i = 0;
		while (j < arr.length) {
			if (arr[j] == e) {
				j++;
				continue;
			}

			newArr[i] = arr[j];
			i++;
			j++;
		}

		return newArr;
	}

	static int[] popArray(int arr[], int e) {
		int newArr[] = new int[arr.length - (e + 1)];

		int j = e + 1;
		int i = 0;
		while (j < arr.length) {
			newArr[i] = arr[j];
			j++;
			i++;
		}

		return newArr;
	}

}
