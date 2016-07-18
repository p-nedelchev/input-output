package task3;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        FileContainer container = new FileContainer();
        String fileName = "MyFile.md";
        String line = "";

        try {
            line = container.createFileReader(fileName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String reversedText = new StringBuffer(line).reverse().toString();

        try {
            container.saveReversedText(fileName, reversedText);
        } catch (IOException ex1) {
            ex1.printStackTrace();
        }
    }
}
