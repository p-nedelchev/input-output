package dataclasstask;

import java.io.Serializable;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Person implements Serializable {

    private final String name;
    private final int age;
    private final String address;
    private final int idNumber;

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
