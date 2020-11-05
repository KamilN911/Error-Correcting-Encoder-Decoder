package correcter.utils.converters;

public class ArrayToString {

    public String convert(String[] input) {
        StringBuilder sb = new StringBuilder();
        for (String s: input) {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }
}
