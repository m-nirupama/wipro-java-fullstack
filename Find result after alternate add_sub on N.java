import java.io.*;
import java.util.*;

public class AlternateAddSubV {
    public int AddSub(int input1, int input2) {
        int result = input1;
        boolean addNext = (input2 == 1);

        for (int i = input1 - 1; i >= 1; i--) {
            if (addNext) {
                result += i;
            } else {
                result -= i;
            }
            addNext = !addNext; // Alternate the operation
        }
        return result;
    }
}
