package task1;

import java.util.Scanner;

public class ConsoleReader {
    Scanner scan = new Scanner(System.in);


    public String readString() {
        String someString;
        return someString = scan.nextLine();
    }

    public String readInt() throws InputDataException {
        String a = scan.nextLine();
        try {
            Integer.valueOf(a);
        } catch (Exception e) {
            throw new InputDataException("This is not an Integer!");
        }
        return a;
    }

    public char readChar() {
        char c;
        return c = scan.next().charAt(0);
    }
}
