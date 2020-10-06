package correcter;

import correcter.encoder.Encoder;
import correcter.errorSimulator.TextHarmer;
import correcter.utils.Input;

public class Main {
    public static void main(String[] args) {

        TextHarmer textHarmer = new TextHarmer();
        Encoder encoder = new Encoder();
        String input = new Input().getUserInput();
        String encodedInput = encoder.encode(input);
        System.out.println(input);
        System.out.println(encodedInput);
        System.out.println(textHarmer.broke(encodedInput));
    }
}
