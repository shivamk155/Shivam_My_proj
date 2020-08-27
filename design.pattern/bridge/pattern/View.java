package bridge.pattern;

public abstract class View {
    Resource r;

    public View(Resource resource) {
        r = resource;
    }


    public abstract String show();
}
