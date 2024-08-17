import java.io.*;
import java.util.*;

class FindStringCodeV1 {
    public int findStringCode(String input1) {
        String[] words = input1.split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            int sum = 0;
            for (int i = 0; i < word.length() / 2; i++) {
                int j = word.length() - i - 1;
                int diff = Math.abs(letterToNo(word.charAt(i)) - letterToNo(word.charAt(j)));
                sum += diff;
            }
            if (word.length() % 2 != 0) {
                sum += letterToNo(word.charAt(word.length() / 2));
            }
            output.append(sum);
        }
        return Integer.parseInt(output.toString());
    }

    public static int letterToNo(char ch) {
        if (Character.isUpperCase(ch))
            return ch - 'A' + 1;
        if (Character.isLowerCase(ch))
            return ch - 'a' + 1;
        return 0;
    }
}
