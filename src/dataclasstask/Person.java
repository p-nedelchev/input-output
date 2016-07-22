package dataclasstask;

import java.io.Serializable;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Person implements Serializable {

    private String name;
    private int age;
    private String address;
    private int idNumber;

    public Person() {
    }

    public Person(String name, int age, String address, int idNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }


    public int getIdNumber() {
        return idNumber;
    }
}
