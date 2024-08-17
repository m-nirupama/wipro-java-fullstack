import java.io.*;
import java.util.*;

class EncodingThreeStringsV1 {
    public class Result {
        public final String output1;
        public final String output2;
        public final String output3;

        public Result(String out1, String out2, String out3) {
            output1 = out1;
            output2 = out2;
            output3 = out3;
        }
    }

    public Result encodeThreeStrings(String input1, String input2, String input3) {
        String[] parts1 = divideString(input1);
        String[] parts2 = divideString(input2);
        String[] parts3 = divideString(input3);

        String output1 = parts1[0] + parts2[0] + parts3[0];
        String output2 = parts1[1] + parts2[1] + parts3[1];
        String output3 = toggleCase(parts1[2] + parts2[2] + parts3[2]);

        return new Result(output1, output2, output3);
    }

    private String[] divideString(String str) {
        int len = str.length();
        int third = len / 3;
        String[] parts = new String[3];

        parts[0] = str.substring(0, third + (len % 3 > 0 ? 1 : 0));
        parts[1] = str.substring(parts[0].length(), parts[0].length() + third);
        parts[2] = str.substring(parts[0].length() + parts[1].length());

        return parts;
    }

    private String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(Character.toLowerCase(c));
            }
        }
        return toggled.toString();
    }
}
