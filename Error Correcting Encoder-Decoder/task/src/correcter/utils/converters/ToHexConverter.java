package correcter.utils.converters;

public class ToHexConverter {

    public String[] convert(byte[] input) {
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = Integer.toHexString(input[i]);
        }
        return result;
    }
}
