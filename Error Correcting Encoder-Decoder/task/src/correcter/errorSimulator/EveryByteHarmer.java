package correcter.errorSimulator;

public class EveryByteHarmer {

    public static String[] broke(String[] input) {
        String[] result = new String[input.length];
            for (int i = 0; i < input.length; i++) {
                result[i] = ByteHarmer.broke(input[i]);
            }
        return result;
    }
}
