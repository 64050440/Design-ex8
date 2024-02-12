public class AirconditionerOnCommand implements Command {
    Airconditioner airconditioner;
    int temp;

    public AirconditionerOnCommand(Airconditioner airconditioner, int temp) {
        this.airconditioner = airconditioner;
        this.temp = temp;
    }

    public void execute() {
        airconditioner.on();
        airconditioner.setTemp(temp);
    }

    public void undo() {
        airconditioner.off();
    }
}