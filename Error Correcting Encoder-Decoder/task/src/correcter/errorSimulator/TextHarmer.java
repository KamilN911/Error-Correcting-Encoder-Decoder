package correcter.errorSimulator;

import java.util.Random;

public class TextHarmer {

    public static String broke (String input) {
        String tab = "abcdefghijklmnoprstuvxyzABCDEFGHIJKLMNOPRSTUVXYZ 1234567890";
        Random random = new Random();
        StringBuilder result = new StringBuilder(input);
        for (int i = 0; i < input.length() - 2; i += 3) {
            int current = random.nextInt(3);
            int tabIndex = random.nextInt(tab.length());
            char character = tab.charAt(tabIndex);
            result.replace(i + current, i + current + 1, String.valueOf(character));
        }
        return result.toString();
    }
}

