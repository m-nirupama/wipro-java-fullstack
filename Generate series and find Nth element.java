public class GenerateSeriesFindNV {
    public int generateSeriesFindN(int input1, int input2, int input3, int input4) {
        int gap1 = input2 - input1;
        int gap2 = input3 - input2;
        int output = input1;

        for (int i = 1; i < input4; i++) {
            if (i % 2 != 0) {
                output += gap1; // Add gap1 for odd index
            } else {
                output += gap2; // Add gap2 for even index
            }
        }
        return output;
    }
}
