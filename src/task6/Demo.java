package task6;

public class Demo {
    public static void main(String[] args) {
        DirectoryBrowser directoryBrowser = new DirectoryBrowser();
        String path = "/home/clouway/workspaces/input-output";
        directoryBrowser.listContent(path);
    }
}

