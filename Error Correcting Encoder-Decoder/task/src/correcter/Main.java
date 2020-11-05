package correcter;

import correcter.errorSimulator.BitHarmer;
import correcter.errorSimulator.ByteHarmer;
import correcter.errorSimulator.EveryByteHarmer;
import correcter.utils.converters.ArrayToString;
import correcter.utils.converters.StringArrayToBytesArray;
import correcter.utils.converters.ToBitConverter;
import correcter.utils.converters.ToHexConverter;
import correcter.utils.io.InputFromAFile;

import java.nio.charset.StandardCharsets;

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
        StringArrayToBytesArray toBytesArray = new StringArrayToBytesArray();
        ArrayToString arrayToString = new ArrayToString();
        String path = "Error Correcting Encoder-Decoder/task/src/correcter/resources/send.txt";
        String original = new String(inputFromAFile.byteArr(path), StandardCharsets.UTF_8);
        String[] arr = bitConverter.convert(inputFromAFile.byteArr(path));
        String[] arr2 = hexConverter.convert(inputFromAFile.byteArr(path));
        String[] harmBytes = everyByteHarmer.broke(arr);
        String originalCorupted = arrayToString.convert(harmBytes);
        String[] harmHex = hexConverter.convert(toBytesArray.convert(originalCorupted));
        System.out.println("original imput:");
        System.out.println("In Binary: ");
        for (String s: arr) {
            System.out.print(s + " ");
        }
        System.out.println("\nIn Hex: ");
        for (String s: arr2) {
            System.out.print(s + " ");
        }
        System.out.println("\n In String: \n" + original);

        System.out.println("\n Every Byte corrupted: ");
        for (String s: harmBytes) {
            System.out.print(s + " ");
        }
        System.out.println("\n Every Hex corrupted: ");
        for (String s: harmHex) {
            System.out.print(s + " ");
        }
//        System.out.println("corrupted One");
//        System.out.println(byteHarmer.broke("1101011"));



    }
}
