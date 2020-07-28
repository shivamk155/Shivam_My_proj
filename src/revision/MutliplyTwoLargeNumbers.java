package revision;

public class MutliplyTwoLargeNumbers {
    public static void main(String[] args) {
        String num1 = "654154154151454545415415454"; //Num1 should always be lesser....else implement an if condition
        String num2 = "63516561563156316545145146514654";

        String ans = "";
        String factor = "1";

        for (int i = num1.length() - 1; i >= 0; i--) {
            String passAns = "";
            int temp;
            int carryOver = 0;
            for (int j = num2.length() - 1; j >= 0; j--) {
                temp = carryOver + (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                passAns = String.valueOf(temp % 10).concat(passAns);
                carryOver = temp / 10;
            }

            if (carryOver > 0)
                passAns = String.valueOf(carryOver).concat(passAns);

            if (!factor.equals("1"))
                ans = add(ans, passAns, factor);
            else
                ans = passAns;

            factor = factor.concat("0");
        }

        System.out.println("Result of multiplying 2 numbers is: " + ans);
    }

    public static String add(String ans, String passAns, String factor) {

        for (int i = 1; i < factor.length(); i++)
            passAns = passAns.concat("0");

        int lengthDiff = passAns.length() - ans.length();

        for (int i = 0; i < lengthDiff; i++)
            ans = "0".concat(ans);

        int temp = 0;
        int carryOver = 0;
        String ansTemp = "";
        for (int i = ans.length() - 1; i >= 0; i--) {
            temp = carryOver + (ans.charAt(i) - '0') + (passAns.charAt(i) - '0');
            ansTemp = String.valueOf(temp % 10).concat(ansTemp);
            carryOver = temp / 10;
        }
        if (carryOver > 0)
            ansTemp = String.valueOf(carryOver).concat(ansTemp);


        return ansTemp;
    }
}
