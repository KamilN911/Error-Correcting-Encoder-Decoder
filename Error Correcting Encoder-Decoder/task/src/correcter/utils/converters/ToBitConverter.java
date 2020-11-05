package correcter.utils.converters;

public class ToBitConverter {

    public String[] convert(byte[] input) {
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = Integer.toBinaryString(input[i]);
        }
        return result;
    }
}
