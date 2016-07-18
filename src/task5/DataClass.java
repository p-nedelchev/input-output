package task5;

import java.io.*;

public class DataClass {
    private ObjectInputStream inObj;
    private ObjectOutputStream outObj;
    private OutputStream out;
    private InputStream in;

    public DataClass(InputStream in, OutputStream out){
        this.in = in;
        this.out = out;
    }

    public void saveObject(Object o) throws IOException {
        outObj = new ObjectOutputStream(out);
        outObj.writeObject(o);
        System.out.println("Object saved!");
        out.close();
        outObj.close();
    }

    public Object getObject() throws IOException, ClassNotFoundException {
        inObj = new ObjectInputStream(in);
        Car someObj = (Car) inObj.readObject();
        System.out.println("Object read!");
        in.close();
        inObj.close();
        return someObj;
    }
}
