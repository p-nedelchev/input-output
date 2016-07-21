package consolereader;

import java.io.*;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class ConsoleReader extends InputStreamReader {

    private char [] buffer;

    public ConsoleReader(InputStream in) {
        super(in);
        buffer = new char[50];
    }

    /**
     * Reads an integer number from the console
     * @return Integer the number that has been read
     * If wrong values are entered (char, float, string) throws
     * NumberFormatException
     */
    public Integer readInt () {
        Integer result = null;
        try {
            int length = this.read(buffer);
            String temp = String.copyValueOf(buffer,0,length - 1);
            result = Integer.parseInt(temp);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Reads a character from the console
     * @return char the character that has been read
     * If more than one characters are entered reads only first one
     */
    public char readChar () {
        int character = 0;
        try {
            character = this.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (char)character;
    }

    /**
     * Reads a string from the console
     * @return String the strung that has been read
     */
    public String readString () {
        String temp = null;
        int length = 0;
        try {
            length = this.read(buffer);
            temp = String.copyValueOf(buffer,0,length - 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }

    /**
     * Reads a float number from the console
     * @return Float the number that has been read
     * If wrong values are entered (char, integer, string) throws
     * NumberFormatException
     */
    public Float readFloat () {
        Float result = null;
        try {
            int length = this.read(buffer);
            String temp = String.copyValueOf(buffer,0,length - 1);
            result = Float.valueOf(temp);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }
}
