
public class LeftRightArraySumEqual {

	public static void main(String[] args) {
		int arr[] = { 12, 3, 4, 1, 4, 15 };
		System.out.println("Index and value of the element having same sum of left and right array :");
		printIndexAndValue(arr);
	}

	static void printIndexAndValue(int arr[]) {
		int arrSum = getSumOftheArray(arr);
			arrSum = arrSum - arr[0];
		int sumSoFar = arr[0];
		int i;

		for (i = 1; i < arr.length; i++) {
			arrSum = arrSum - arr[i];
			
			if(sumSoFar == arrSum){
				break;
			}
			sumSoFar += arr[i];
		}
		System.out.println(i + ":" + arr[i]);
	}

	static int getSumOftheArray(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
