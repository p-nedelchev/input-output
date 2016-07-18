package task1;

public class Demo {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        boolean done = false;

        //read string from console
        System.out.println("Enter String: ");
        reader.readString();

        //read integer from console
        System.out.println("Enter Integer: ");
        do {
            try {
                reader.readInt();
                done = true;
            } catch (InputDataException ex) {
                System.out.println("This is not an Integer! Enter new Integer: ");
            }
        }while (!done);

        // read character from console
        System.out.println("Enter Character: ");
        reader.readChar();

    }
}
