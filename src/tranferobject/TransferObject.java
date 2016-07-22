package tranferobject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class TransferObject {

    private byte [] buffer = null;

    public TransferObject() {
        buffer = new byte[1000];
    }

    /**
     * Transfers input stream to output stream
     * @param in InputStream input source
     * @param out OutputStream output destination
     */
    public void transfer (InputStream in, OutputStream out) {
        try {
            int read = in.read(buffer);
            out.write(buffer, 0, read);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Transfers size bytes from input stream to output stream
     * starting from offset
     * @param in InputStream input source
     * @param out OutputStream output destination
     * @param offset int starting point
     * @param size int length of transferred bytes
     * If size is greater than input stream length only bytes
     * from offset to the end of input stream are transferred
     */
    public void transfer (InputStream in, OutputStream out, int offset, int size) {
            try {
                int read = 0;
                read = in.read(buffer);
                if (read < size) {
                    out.write(buffer, offset, read - offset);
                } else {
                    out.write(buffer, offset, size);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
