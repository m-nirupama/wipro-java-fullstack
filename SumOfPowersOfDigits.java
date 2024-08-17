import java.io.*;
import java.util.*;

class SumOfPowersOfDigitsV1 {
    public int sumOfPowerOfDigits(int input1) {
        if (input1 <= 9) return 0;

        return calculateSumOfPowers(String.valueOf(input1), 0);
    }

    private int calculateSumOfPowers(String num, int index) {
        if (index == num.length() - 1) {
            System.out.println(num.charAt(index) + " ^ " + 0);
            return 1;
        }

        int base = Integer.parseInt(String.valueOf(num.charAt(index)));
        int exponent = Integer.parseInt(String.valueOf(num.charAt(index + 1)));
        int power = (int) Math.pow(base, exponent);

        return power + calculateSumOfPowers(num, index + 1);
    }
}
