package directorybrowser;

import java.util.ArrayList;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Demo {
    public static void main(String[] args) {

        DirectoryBrowser browser = new DirectoryBrowser();
        ArrayList < String > listOfitems = browser.listContent("/home/clouway/clouway/workspaces/idea/.gitignore");
        for (String listOfitem : listOfitems) {
            System.out.println(listOfitem);
        }
    }
}
