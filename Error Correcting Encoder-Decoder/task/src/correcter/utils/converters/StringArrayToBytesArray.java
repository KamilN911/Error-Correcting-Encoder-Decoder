package correcter.utils.converters;

public class StringArrayToBytesArray {

    public static byte[] convert(String input) {
        byte[] result = new byte[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = Byte.parseByte(input);
        }
        return result;
    }
}
