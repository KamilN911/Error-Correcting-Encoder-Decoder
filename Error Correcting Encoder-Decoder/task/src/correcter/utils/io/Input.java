package correcter.utils.io;

import java.util.Scanner;

public class Input {

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
