import java.io.*;
import java.util.*;

class SumOfSumsOfDigitsInCyclicOrderV{
    public int sumOfSumsOfDigits(int input1) {
        String num = String.valueOf(input1);
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            int tempSum = 0;
            for (int j = i; j < num.length(); j++) {
                tempSum += Character.getNumericValue(num.charAt(j));
            }
            sum += tempSum;
        }
        return sum;
    }
}
