package task4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        TransferObject transferObject = new TransferObject();
        FileInputStream in = new FileInputStream("MyFile.md");
        FileOutputStream out = new FileOutputStream("YourFile.md");

        transferObject.transfer(in,out,2,7);

        in.close();
        out.close();
    }
}
