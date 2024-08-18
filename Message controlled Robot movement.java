import java.io.*;
import java.util.*;

public class MsgControlledRobotV1 {
    public String moveRobot(int input1, int input2, String input3, String input4) {
        int X = input1, Y = input2;
        String currentPos = input3, msg = input4;

        int currX = Integer.parseInt(currentPos.split("-")[0]);
        int currY = Integer.parseInt(currentPos.split("-")[1]);
        String currD = currentPos.split("-")[2];
        String[] instructions = msg.split(" ");
        StringBuilder output = new StringBuilder();

        Map<String, String[]> directionMap = new HashMap<>();
        directionMap.put("E", new String[]{"N", "S"});
        directionMap.put("W", new String[]{"S", "N"});
        directionMap.put("N", new String[]{"W", "E"});
        directionMap.put("S", new String[]{"E", "W"});

        for (String instruction : instructions) {
            if (instruction.equals("M")) {
                if (currD.equals("E") && currX + 1 > X || currD.equals("W") && currX - 1 < 0
                        || currD.equals("N") && currY + 1 > Y || currD.equals("S") && currY - 1 < 0) {
                    output.append("-ER");
                    break;
                }

                if (currD.equals("E")) currX++;
                else if (currD.equals("W")) currX--;
                else if (currD.equals("N")) currY++;
                else if (currD.equals("S")) currY--;
            } else {
                currD = instruction.equals("L") ? directionMap.get(currD)[0] : directionMap.get(currD)[1];
            }

            output.delete(0, output.length());
            output.append(currX).append("-").append(currY).append("-").append(currD);
        }
        return output.toString();
    }
}
