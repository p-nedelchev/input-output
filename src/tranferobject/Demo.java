package tranferobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Demo {
    public static void main(String[] args) {

        TransferObject trans = new TransferObject();
        try {
            FileInputStream source = new FileInputStream("test.txt");
            FileOutputStream destination = new FileOutputStream("dest.txt");
            trans.transfer(source, destination, 4, 15);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
