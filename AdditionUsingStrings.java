import java.io.*;
import java.util.*;
import java.math.BigInteger;

class AdditionUsingStringsV {
    public String additionUsingStrings(String input1, String input2) {
        BigInteger x = new BigInteger(input1);
        BigInteger y = new BigInteger(input2);
        return x.add(y).toString();
    }
}
