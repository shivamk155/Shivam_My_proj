import static java.lang.System.out;

import java.util.Arrays;

public class BinaryArraySorting {

	public static void main(String[] args) {
		
		int[] arr = { 1, 0, 1, 1, 1, 1, 1, 0, 0, 0 };
		out.println(Arrays.toString(arr));
		
		int firstPtr = 0;
		int lastPtr = arr.length - 1;

		while (firstPtr < lastPtr) {
			if(arr[firstPtr] == 1 && arr[lastPtr] == 0){
				arr[firstPtr] = 0;
				arr[lastPtr] = 1;
				
				firstPtr++;
				lastPtr--;
			}else if(arr[firstPtr] == 0 && arr[lastPtr] == 0){
				firstPtr++;
			}else if(arr[firstPtr] == 1 && arr[lastPtr] == 1){
				lastPtr--;
			}else{
				firstPtr++;
				lastPtr--;
			}

		}

		out.println(Arrays.toString(arr));
	}
	
	

}
