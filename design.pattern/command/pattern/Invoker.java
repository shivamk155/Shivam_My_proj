package command.pattern;

//
public class Invoker {
    private Command lightOnButton;
    private Command lightOffButton;
    private Command lightDimUpButton;
    private Command lightDimDownButton;

    public Invoker(Command lightOnButton, Command lightOffButton, Command lightDimUpButton) {
        this.lightOnButton = lightOnButton;
        this.lightOffButton = lightOffButton;
        this.lightDimUpButton = lightDimUpButton;
    }

    public void lightOn() {
        lightOnButton.execute();
    }

    public void lightOff() {
        lightOffButton.execute();
    }

    public void lightDimUp() {
        lightDimUpButton.execute();
    }

    public void lightDimDown() {
        lightDimUpButton.execute();
    }
}
