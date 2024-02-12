public class AirconditionerOffCommand implements Command {
    Airconditioner airconditioner;

    public AirconditionerOffCommand(Airconditioner airconditioner) {
        this.airconditioner = airconditioner;

    }

    public void execute() {
        airconditioner.off();
    }

    public void undo() {
        airconditioner.on();
    }
}