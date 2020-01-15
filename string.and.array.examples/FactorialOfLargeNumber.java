import static java.lang.System.out;

import java.util.Arrays;

public class FactorialOfLargeNumber {

	public static void main(String[] args) {

		int[] finalArr = {1};

		int n = 15;

		for (int i = 2; i <= n; i++) {
			finalArr = multiply(finalArr, i);
		}
		out.println("value of "+n+" factorial is:" + Arrays.toString(finalArr));
	}

	public static int[] multiply(int[] finalArr, int i) {
		int remainder;
		int carryOver = 0;
		

		for (int k = finalArr.length-1 ; k >= 0; k--) {
			int temp = (finalArr[k] * i) + carryOver;
			carryOver=0;
			if (temp < 9) {
				finalArr[k] = temp;
			} else {
				carryOver = temp / 10;
				remainder = temp % 10;
				finalArr[k] = remainder;
			}
		}

		if (carryOver > 0) {
			return adjustArray(finalArr, carryOver);
		}

		return finalArr;
	}

	//One correction need to be made i.e. carryOver can be of more than 1 digit so need to be parsed over
	public static int[] adjustArray(int[] finalArr, int carryOver) {
		int[] temp = new int[finalArr.length+1]; 

		for (int i = finalArr.length-1; i >= 0; i--) {
			temp[i + 1] = finalArr[i];
		}

		temp[0] = carryOver;
		
		return temp;
	}

}
