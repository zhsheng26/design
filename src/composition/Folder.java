package composition;

import java.util.ArrayList;

public class Folder extends File {

    private final ArrayList<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println("文件夹:" + getName());
        for (File file : files) {
            file.display();
        }
    }

    @Override
    public void add(File file) {
        this.files.add(file);
    }

    @Override
    public void remove(File file) {
        this.files.remove(file);
    }

}
