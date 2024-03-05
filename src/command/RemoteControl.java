package command;

import java.util.Stack;

// Invoker 클래스 - 리모컨
class RemoteControl {
    private Command command;
    private final Stack<Command> commandHistory = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandHistory.push(command);
    }

    public void pressUndoButton() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("No command to undo.");
        }
    }
}
