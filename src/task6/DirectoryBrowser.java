package task6;

import java.io.File;

public class DirectoryBrowser {
    public void listContent(String path) {
        File file = new File(path);
        File[] list = file.listFiles();
        if (file.isFile())
            System.out.println("This is file!");
        else {
            for (int i = 0; i < list.length; i++) {
                if (file.isDirectory()) {
                    System.out.println(list[i].getName());
                }
            }
        }
    }
}
