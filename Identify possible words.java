import java.io.*;
import java.util.*;

class IdentifyPossibleWordsV {
    public String identifyPossibleWords(String input1, String input2) {
        input1 = input1.toUpperCase();
        StringBuilder output = new StringBuilder();
        String[] words = input2.split(":");
        int underscoreIndex = input1.indexOf('_');

        for (String word : words) {
            word = word.toUpperCase();
            if (word.length() == input1.length() &&
                input1.regionMatches(0, word, 0, underscoreIndex) &&
                input1.regionMatches(underscoreIndex + 1, word, underscoreIndex + 1, input1.length() - underscoreIndex - 1)) {
                output.append(word).append(":");
            }
        }

        return output.length() > 0 ? output.substring(0, output.length() - 1) : "ERROR-009";
    }
}
