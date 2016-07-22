package dataclasstask;

import java.io.*;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class DataClass {

    /**
     * Writes a serializable object in output stream
     * @param out OutputStream
     * @param ob  Object object to be serialized
     * @throws IOException
     */
    public void saveObject ( OutputStream out, Object ob ) throws IOException {
        try (ObjectOutputStream outstream = new ObjectOutputStream(out)) {
            outstream.writeObject(ob);
        }
    }

    /**
     * Deserialize object previously written with ObjectOutputStream
     * @param in InputStream
     * @return Object the object read from stream
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object getObject ( InputStream in ) throws IOException, ClassNotFoundException {
        Object object;
        try (ObjectInputStream instream = new ObjectInputStream(in)) {
            object = instream.readObject();
        }
        return object;
    }
}
