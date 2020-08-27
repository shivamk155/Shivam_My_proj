package bridge.pattern;

public class LongView extends View {

    LongView(Resource resource){
        super(resource);
    }

    @Override
    public String show() {
        return "Long view" + r.title();
    }


}
