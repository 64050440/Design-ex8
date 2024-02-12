public class SmartHomeTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light bedroomLight = new Light("Bed Room");
        Light kitchenLight = new Light("Kitchen");
        Airconditioner bedroomAC = new Airconditioner("Bed Room");

        Command bedroomLightOn = new LightOnCommand(bedroomLight);
        Command bedroomLightOff = new LightOffCommand(bedroomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);

        Command bedroomACOn = new AirconditionerOnCommand(bedroomAC, 25);

        Command bedroomACOff = new AirconditionerOffCommand(bedroomAC);

        remote.setCommand(0, bedroomLightOn, bedroomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, bedroomACOn, bedroomACOff);

        System.out.println("slot 0, light Bed Room");
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        System.out.println("--------------------------------");
        System.out.println("slot 1, light Kitchen");
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        System.out.println("--------------------------------");
        System.out.println("slot 2, AC Bed Room");
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        System.out.println("--------------------------------");
        System.out.println("test one unavailable slot, slot 3");
        remote.onButtonWasPushed(3);
        remote.offButtonWasPushed(3);
    }
}
