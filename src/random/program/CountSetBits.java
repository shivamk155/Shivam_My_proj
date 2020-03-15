package random.program;

public class CountSetBits {
    public static void main(String[] args) {
        int a = 1023; //1024 , 1025
        int temp = a;
        int k = 0;

        while (temp != 1) {
            if (temp % 2 == 1)
                k++;
            temp = temp / 2;
        }

        System.out.println("Total number of count bits is:" + (k + 1));
    }
}
