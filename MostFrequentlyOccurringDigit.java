import java.io.*;
import java.util.*;

class MostFrequentlyOccurringDigitV1 {
    public int mostFrequentlyOccurringDigit(int[] input1, int input2) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int ip : input1) {
            while (ip > 0) {
                int digit = ip % 10;
                freqMap.put(digit, freqMap.getOrDefault(digit, 0) + 1);
                ip /= 10;
            }
        }

        int maxFreq = 0;
        int maxFreqDigit = 0;
        for (int i = 9; i >= 0; i--) {
            int freq = freqMap.getOrDefault(i, 0);
            if (freq > maxFreq) {
                maxFreqDigit = i;
                maxFreq = freq;
            }
        }
        return maxFreqDigit;
    }
}
