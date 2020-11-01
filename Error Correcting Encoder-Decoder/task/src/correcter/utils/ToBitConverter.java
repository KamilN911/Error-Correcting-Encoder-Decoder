package correcter.utils;

public class ToBitConverter {

    public String convert(byte[] input) {
        StringBuilder sb = new StringBuilder();
        for (byte b : input) {
            sb.append(Integer.toBinaryString(b));
        }
        return sb.toString();
    }
}
