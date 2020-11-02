package correcter.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFromAFile {

    public byte[] byteArr(String path) {
        StringBuilder sb = new StringBuilder();
        File file = new File(path);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                sb.append(sc.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sb.toString().getBytes();
    }
}
