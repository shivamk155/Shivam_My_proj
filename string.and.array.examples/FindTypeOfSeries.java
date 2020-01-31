public class FindTypeOfSeries {
    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 27, 81, 243, 729};
        //int[] arr = {2, 3, 5, 8, 13, 21, 34, 55};
        //int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        int gp=0, ap=0,fb=0;

        for(int i=2; i<arr.length; i++){
            if(arr[i] == arr[i-1]+arr[i-2]){
                fb++;
            }

            if(arr[i] - arr[i-1] == arr[i-1] - arr[i-2]){
                ap++;
            }

            if(arr[i] / arr[i-1] == arr[i-1] / arr[i-2]){
                gp++;
            }
        }

        if(fb == arr.length-2){
            System.out.print("series is fibonacci");
        }else if(ap == arr.length-2){
            System.out.print("series is AP");
        }else if(gp == arr.length-2){
            System.out.print("series is GP");
        }else{
            System.out.print("series is not GP, AP, Fibnacci");
        }
    }
}
