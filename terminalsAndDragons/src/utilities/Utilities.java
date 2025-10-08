package utilities;

import java.util.Scanner;

public class Utilities {

    public static String ask(java.util.Scanner scanner, String textToAsk) {
        System.out.println(textToAsk);
        return scanner.nextLine();
    }
}
