import java.io.*;
import java.util.*;

class GetCodeThroughStringsV1 {
    public int getCodeThroughStrings(String input1) {
        String[] words = input1.split(" ");
        int pin = 0;

        for (String word : words) {
            pin += word.length();
        }

        return calculatePin(pin);
    }

    private int calculatePin(int pin) {
        if (pin < 10) {
            return pin;
        }

        int pin2 = 0;
        while (pin > 0) {
            pin2 += pin % 10;
            pin /= 10;
        }

        return calculatePin(pin2);
    }
}
