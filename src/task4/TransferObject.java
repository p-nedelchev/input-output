package task4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TransferObject {
    public void transfer(InputStream in, OutputStream out, int from, int to) throws IOException {
        byte[] bytes = new byte[1024];
        in.read(bytes);
        for (int i = from; i <= to; i++) {
            System.out.println(bytes[i]);
            out.write(bytes[i]);
        }
        in.close();
        out.close();
    }
}


