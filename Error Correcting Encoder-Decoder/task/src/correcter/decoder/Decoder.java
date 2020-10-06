package correcter.decoder;

public class Decoder {

    public String decode(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                sb.append(str.charAt(i));
            } else {
                sb.append(str.charAt(i + 2));
            }
        }
        return sb.toString();
    }
}
