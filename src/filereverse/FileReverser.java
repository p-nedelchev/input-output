package filereverse;


import java.io.*;
import java.nio.file.Path;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class FileReverser {

    private StringBuffer buffer = null;

    /**
     * Reverses the content of the file indicated by its parameter
     * @param filename File path to the file that needs to be reversed
     */
    public void reverseFile (Path filename) {
        try ( BufferedReader reader = new BufferedReader(new FileReader(filename.toFile()))) {
            String test;
            String content = "";
            while ((test = reader.readLine()) != null) {
                content += "\n" + test;
            }
            System.out.println(content);
            buffer = new StringBuffer(content);
            System.out.println(buffer.toString());
            buffer.reverse();
            System.out.println(buffer.toString());
            PrintWriter writer = new PrintWriter(filename.toFile());
            writer.println(buffer);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
