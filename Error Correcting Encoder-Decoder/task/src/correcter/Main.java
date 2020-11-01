package correcter;

import correcter.decoder.Decoder;
import correcter.encoder.Encoder;
import correcter.errorSimulator.TextHarmer;
import correcter.utils.Input;
import correcter.utils.InputFromAFile;

public class Main {
    public static void main(String[] args) {

        TextHarmer textHarmer = new TextHarmer();
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        String input = new Input().getUserInput();
        String encodedInput = encoder.encode(input);
        System.out.println(input);
        System.out.println(encodedInput);
        System.out.println(textHarmer.broke(encodedInput));
        System.out.println(decoder.decode(encodedInput));

    }
}
