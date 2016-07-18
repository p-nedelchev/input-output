package task5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        FileOutputStream fileOut = new FileOutputStream("objOut.bin");
        FileInputStream fileIn = new FileInputStream("objOut.bin");
        DataClass data = new DataClass(fileIn,fileOut);
        Car car = new Car(8, 10);

        data.saveObject(car);
        data.getObject();
        System.out.println("Object Size: " + car.size + "\n" + "Object Weigth: " + car.weigth);
    }
}
