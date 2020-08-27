package command.pattern;

public class LightDimUpCommand implements Command {
    Light light;

    public LightDimUpCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        System.out.println("Light is dimmed up.");
    }

    @Override
    public void unexecute() {

    }
}
