package correcter.encoder;

public class Encoder {

    public String encode(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i + 1);
            sb.append(s);
            sb.append(s);
            sb.append(s);
        }
        return sb.toString();
    }
}
