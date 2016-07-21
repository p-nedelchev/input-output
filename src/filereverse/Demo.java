package filereverse;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Demo {
    public static void main(String[] args) {
        Path source = Paths.get("test.txt");
        FileReverser reverser = new FileReverser();
        reverser.reverseFile(source);
    }
}
