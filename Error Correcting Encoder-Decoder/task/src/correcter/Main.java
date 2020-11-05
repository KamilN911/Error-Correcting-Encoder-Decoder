package correcter;

import correcter.decoder.Decoder;
import correcter.encoder.Encoder;
import correcter.errorSimulator.BitHarmer;
import correcter.errorSimulator.ByteHarmer;
import correcter.errorSimulator.EveryByteHarmer;
import correcter.errorSimulator.TextHarmer;
import correcter.utils.Input;
import correcter.utils.InputFromAFile;
import correcter.utils.ToBitConverter;
import correcter.utils.ToHexConverter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        TESTING BEHAVIOUR OF ENCODING AND DECODING CLASSES
//
//        TextHarmer textHarmer = new TextHarmer();
//        Encoder encoder = new Encoder();
//        Decoder decoder = new Decoder();
//        String input = new Input().getUserInput();
//        String encodedInput = encoder.encode(input);
//        System.out.println(input);
//        System.out.println(encodedInput);
//        System.out.println(textHarmer.broke(encodedInput));
//        System.out.println(decoder.decode(encodedInput));

        ToBitConverter bitConverter = new ToBitConverter();
        ToHexConverter hexConverter = new ToHexConverter();
        InputFromAFile inputFromAFile = new InputFromAFile();
        BitHarmer bitHarmer = new BitHarmer();
        ByteHarmer byteHarmer = new ByteHarmer();
        EveryByteHarmer everyByteHarmer = new EveryByteHarmer();
        String path = "Error Correcting Encoder-Decoder/task/src/correcter/resources/send.txt";
        String[] arr = bitConverter.convert(inputFromAFile.byteArr(path));
        String[] arr2 = hexConverter.convert(inputFromAFile.byteArr(path));
        System.out.println("original imput:");
        System.out.println("In Binary: ");
        for (String s: arr) {
            System.out.print(s + " ");
        }
        System.out.println("\nIn Hex: ");
        for (String s: arr2) {
            System.out.print(s + " ");
        }
        System.out.println("\n Every Byte corrupted: ");
        System.out.println(Arrays.toString(everyByteHarmer.broke(arr)));
//        System.out.println("corrupted One");
//        System.out.println(byteHarmer.broke("1101011"));



    }
}
