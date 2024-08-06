

public class CommandTest {

    public static void main(String[] args) {
        // Create the receiver
        Light livingRoomLight = new Light();

        // Create the concrete command objects
        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);

        // Create the invoker
        RemoteControl remoteControl = new RemoteControl();

        // Turn the light on
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        // Turn the light off
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}
