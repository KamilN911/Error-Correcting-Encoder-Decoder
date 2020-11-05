package correcter.utils.io;
import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class InputFromAFile {

    public static byte[] byteArr(String path) {
        File file = new File(path);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] result = fileInputStream.readAllBytes();
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
