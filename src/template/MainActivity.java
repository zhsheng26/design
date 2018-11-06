package template;

public class MainActivity extends Activity {

    private View view;

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("MainActivity页面开启");
    }

    @Override
    View onCreated() {
        view = new View();
        return view;
    }

    @Override
    protected boolean onResume() {
        String data = requestData();
        if (!data.equals("")) {
            view.setContent(data);
            return true;
        } else {
            return super.onResume();
        }
    }

    private String requestData() {
        return "获取网络数据";
    }

    @Override
    protected void onComplete() {
        super.onComplete();
        System.out.println("页面显示完成");
    }
}
