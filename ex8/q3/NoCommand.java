public class NoCommand implements Command {
    public void execute() {
        System.out.println("No command is assigned to this slot");
    }

    public void undo() {
        // No action required
    }
}