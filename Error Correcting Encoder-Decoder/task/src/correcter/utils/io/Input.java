package correcter.utils.io;

import java.util.Scanner;

public class Input {

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
