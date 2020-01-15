package two.dimensional.arrays;

import static java.lang.System.out;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];

		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		arr[0][3] = 1;

		arr[1][0] = 2;
		arr[1][1] = 2;
		arr[1][2] = 2;
		arr[1][3] = 2;

		arr[2][0] = 3;
		arr[2][1] = 3;
		arr[2][2] = 3;
		arr[2][3] = 3;

		arr[3][0] = 4;
		arr[3][1] = 4;
		arr[3][2] = 4;
		arr[3][3] = 4;
		out.println("------------------------------------------");			
		out.println("\n");
		
		printArr(arr);
		
		out.println("------------------------------------------");			
		out.println("\n");
		

		int[][] tmp = transposeMatrix(arr);
		
		out.println("------------------------------------------");			
		out.println("\n");
		
		printArr(tmp);

	}

	public static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				out.print(arr[i][j] + ",");
			}
			out.println("\n");
		}
	}

	public static int[][] transposeMatrix(int[][] arr) {

		int[][] tmp = new int[arr.length][arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				tmp[j][i] = arr[i][j];
			}
		}
		return tmp;
	}

}
