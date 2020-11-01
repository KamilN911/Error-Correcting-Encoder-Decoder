package correcter.utils;

public class ToHexConverter {

    public String convert(byte[] input) {
        StringBuilder sb = new StringBuilder();
        for (byte b : input) {
            sb.append(Integer.toHexString(b));
        }
        return sb.toString();
    }
}
