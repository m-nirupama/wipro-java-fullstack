import java.io.*;
import java.util.*;

public class FindPasswordStableUnstableV1 {
    public int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int[] nums = {input1, input2, input3, input4, input5};
        int stable = 0, unstable = 0;

        for (int num : nums) {
            if (isStable(num)) stable += num;
            else unstable += num;
        }
        return stable - unstable;
    }

    public static boolean isStable(int num) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        String numStr = String.valueOf(num);

        for (char ch : numStr.toCharArray()) {
            int digit = Character.getNumericValue(ch);
            freqMap.put(digit, freqMap.getOrDefault(digit, 0) + 1);
        }

        Collection<Integer> freqValues = freqMap.values();
        Integer firstFreq = freqValues.iterator().next();

        for (int freq : freqValues) {
            if (!freq.equals(firstFreq)) {
                return false;
            }
        }
        return true;
    }
}
