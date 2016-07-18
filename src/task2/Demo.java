package task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        FileWriter writer = new FileWriter(new File("MyFile.md"));
        System.out.println("Enter some text: ");
        String text;
        while (scan.hasNextLine()) {
            text = scan.next();
            if (text.equals(".") || text.equals("#")) {
                break;
            }
            writer.write(text);
            writer.flush();
        }
    }
}

