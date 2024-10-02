package designPattern.behavioral.command;

public class CommandImpl {
    // Client
    public static void main(String[] args) {
        // Define receiver
        Light light = new Light();
        // Set receiver with command
        ICommand onCommand = new LightOffCommand(light);
        // Create invoker (remote)
        Remote remote = new Remote();
        // Set command for invoker
        remote.setCommand(onCommand);

        // Execute command
        remote.pressButton();
    }
}

// 1. Define command interface
interface ICommand {
    void execute();
}
// 2. Define receiver class (handle action)
class Light {
    public void turnOn() {
        System.out.println("Light turn on");
    }

    public void turnOff() {
        System.out.println("Light turn off");
    }
}
// 3. Impl ICommand, forward execute to receiver
class LightOnCommand implements ICommand {
    private Light light;
    // 3.1 set receiver in constructor
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        // 3.2 involve receiver to execute method
        light.turnOn();
    }
}
class LightOffCommand implements ICommand {
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }
}
// 4. Define the Invoker
class Remote {
    private ICommand command;
    public void setCommand(ICommand command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
    }
}
