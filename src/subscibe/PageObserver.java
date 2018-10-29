package subscibe;


import java.util.Observable;
import java.util.Observer;

public class PageObserver implements Observer {
    private String page;

    public PageObserver(String page) {
        this.page = page;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(page + "当前切换页面：" + arg);
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
