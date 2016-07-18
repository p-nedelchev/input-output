package task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileContainer {
    private FileReader file;
    private BufferedReader br;
    private FileWriter fw;

    //create a new reader and buffer and return text in file
    public String createFileReader(String fileName) throws IOException {
        file = new FileReader(fileName);
        br = new BufferedReader(file);

        return br.readLine();
    }

    //save reversed text in same file
    public void saveReversedText(String fileName, String text) throws IOException {
        fw = new FileWriter(fileName);
        fw.write(text);
        if(fw != null){
            fw.close();
        }
    }
}
