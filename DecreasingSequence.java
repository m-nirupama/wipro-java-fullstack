import java.io.*;
import java.util.*;

class DecreasingSequenceV {
    public class Result {
        public final int output1;
        public final int output2;

        public Result(int out1, int out2) {
            output1 = out1;
            output2 = out2;
        }
    }

    public Result decreasingSeq(int[] input1, int input2) {
        int dcrCount = 0;
        int longestLen = 0;
        int spikeCount = 0;
        boolean isDecreasing = false;

        for (int i = 0; i < input2 - 1; i++) {
            if (input1[i] > input1[i + 1]) {
                if (!isDecreasing) {
                    spikeCount++;
                    isDecreasing = true;
                }
                dcrCount++;
                longestLen = Math.max(dcrCount, longestLen);
            } else {
                if (isDecreasing) {
                    isDecreasing = false;
                    dcrCount = 0;
                }
            }
        }

        if (spikeCount > 0) {
            longestLen++;
        }

        return new Result(spikeCount, longestLen);
    }
}
