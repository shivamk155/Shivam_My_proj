package bridge.pattern;

public class ShortView extends View {

    ShortView(Resource resource) {
        super(resource);
    }

    @Override
    public String show() {
        return "Short View" + r.title();
    }
}
