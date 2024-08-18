import java.io.*;
import java.util.*;

public class Remove1DigitForPalindromeV {
    public int digitRemove_Palin(int input1) {
        String numStr = String.valueOf(input1);

        for (int i = 0; i < numStr.length(); i++) {
            String newNum = numStr.substring(0, i) + numStr.substring(i + 1);
            if (isPalindrome(newNum)) {
                return Character.getNumericValue(numStr.charAt(i));
            }
        }
        return -1;
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
