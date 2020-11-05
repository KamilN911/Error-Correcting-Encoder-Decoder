package correcter.utils.converters;

public class StringArrayToBytesArray {

    public static byte[] convert(String input) {
        byte[] result = new byte[input.length()];
        String current = "";
        int j = 0;
        for (int i = 0; i < input.length(); i++) {
            current = input.substring(i, i + 1);
            if (current.equals("1") || current.equals("0")) {
                result[j] = Byte.parseByte(current);
                j++;
            }
//          result[i] = Character.getDirectionality(input.charAt(i));
        }
        return result;
    }
}
