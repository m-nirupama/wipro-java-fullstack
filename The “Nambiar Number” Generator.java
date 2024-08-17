import java.io.*;
import java.util.*;

public class NambiarNumberGeneratorV1 {
    public int nnGenerator(String input1) {
        String mobileNo = input1;
        StringBuilder numbiarNo = new StringBuilder();

        int i = 0;
        while (i < mobileNo.length()) {
            int digit = Character.getNumericValue(mobileNo.charAt(i));
            int evenOdd = digit % 2 == 0 ? 0 : 1;
            int sum = digit;

            int j = i + 1;
            while (j < mobileNo.length() && (sum % 2 == evenOdd)) {
                sum += Character.getNumericValue(mobileNo.charAt(j));
                j++;
            }

            numbiarNo.append(sum);
            i = j;
        }
        return Integer.parseInt(numbiarNo.toString());
    }
}
