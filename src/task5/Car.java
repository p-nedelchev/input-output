package task5;

import java.io.Serializable;

public class Car implements Serializable{
    public int size;
    public int weigth;

    public Car(int size, int weigth) {
        this.size = size;
        this.weigth = weigth;
    }
}
