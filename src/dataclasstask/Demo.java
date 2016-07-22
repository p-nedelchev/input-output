package dataclasstask;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Demo {

    public static void main(String[] args) {
        Person person1 = new Person("Peter", 26, "VT", 123456789);
        DataClass data = new DataClass();
        try {
            FileOutputStream fileOut = new FileOutputStream("serialize.ser");
            FileInputStream fileIn = new FileInputStream("serialize.ser");
            data.saveObject(fileOut, person1);
            Person person2 = (Person) data.getObject(fileIn);
            System.out.println("name: " + person2.getName());
            System.out.println("age: " + person2.getAge());
            System.out.println("address: " + person2.getAddress());
            System.out.println("idNum: " + person2.getIdNumber());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
