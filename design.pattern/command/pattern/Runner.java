package command.pattern;

public class Runner {
    public static void main(String[] args) {
        Light light = new Light();
        Invoker invoker = new Invoker(new LightOnCommand(light), new LightOffCommand(light),
                new LightDimUpCommand(light));

        invoker.lightOn();

        invoker.lightOff();
        invoker.lightDimUp();
    }
}
