package template;

public class View {
    private  String content;

    public View() {
    }

    public View(String content) {
        this.content = content;
    }

    void display() {
        System.out.println(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
