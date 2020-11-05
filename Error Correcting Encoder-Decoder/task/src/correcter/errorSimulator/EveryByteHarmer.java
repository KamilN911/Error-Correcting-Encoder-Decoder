package correcter.errorSimulator;

public class EveryByteHarmer {

    public String[] broke(String[] input) {
        ByteHarmer byteHarmer = new ByteHarmer();
        String[] result = new String[input.length];
            for (int i = 0; i < input.length; i++) {
                result[i] = byteHarmer.broke(input[i]);
            }
        return result;
    }
}
