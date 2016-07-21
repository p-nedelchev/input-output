package consoletofile;

import java.io.*;
import java.util.Scanner;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class ReaderToFile {


    /**
     * Reads text input from the console and writes it to file
     * First line is the name of the file that will be created or
     * file that text will be appended to.
     */
    public void readToFile () {
        String temp = "";
        String test;
        try ( Scanner scan = new Scanner(System.in);
              BufferedWriter writer = new BufferedWriter(new FileWriter(scan.nextLine(), true))) {
            while (!(test = scan.nextLine()).equals(".")) {
                temp += test;
            }
            writer.write(temp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
