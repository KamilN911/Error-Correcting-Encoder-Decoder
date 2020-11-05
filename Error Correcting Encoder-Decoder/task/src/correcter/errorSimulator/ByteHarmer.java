package correcter.errorSimulator;

import java.util.Arrays;
import java.util.Random;

public class ByteHarmer {

    public String broke(String input) {
        Random random = new Random();
        int index = random.nextInt(input.length()-1);
        String[] temp = input.split("");
        if (temp[index].equals("1")) {
            temp[index] = "0";
        } else {
            temp[index] = "1";
        }
        StringBuilder sb = new StringBuilder();
        for (String s: temp) {
            sb.append(s);
        }
        return sb.toString();
    }
}
