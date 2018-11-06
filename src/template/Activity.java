package template;

public abstract class Activity {

    private boolean show = true;

    Activity() {
        init();
    }

    private void init() {
        onStart();
        View view = onCreated();
        if (show = onResume()) {
            view.display();
        }
        onComplete();
    }

    abstract View onCreated();

    protected void onStart() {

    }

    protected boolean onResume() {
        return show;
    }

    protected void onComplete() {

    }

    public boolean isShow() {
        return show;
    }

}
