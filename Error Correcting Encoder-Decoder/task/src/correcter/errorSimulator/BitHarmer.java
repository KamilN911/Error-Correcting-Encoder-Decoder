package correcter.errorSimulator;

import java.util.Arrays;
import java.util.Random;

public class BitHarmer {

    public String broke(String input) {
        Random random = new Random();
        int index = random.nextInt(input.length()-1);
        String[] temp = input.split("");
        if (temp[index].equals("1")) {
            temp[index] = "0";
        } else {
            temp[index] = "1";
        }
        return Arrays.toString(temp);
    }
}
