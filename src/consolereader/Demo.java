package consolereader;

import java.io.IOException;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Demo {
    public static void main(String[] args) {

        ConsoleReader cr = new ConsoleReader(System.in);
        int a = cr.readInt();
        System.out.println(a);
    }
}
