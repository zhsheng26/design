package composition;

public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder("文件夹A");
        folder.add(new TextFile("文本A"));
        folder.add(new VideoFile("视频A"));
        Folder folder1 = new Folder("文件夹B");
        folder1.add(new TextFile("文本B"));
        folder.add(folder1);
        folder.display();
        folder.remove(folder1);
        System.out.println("=======");
        folder.display();
    }
}
