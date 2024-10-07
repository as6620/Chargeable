//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Chargeable[] devices = new Chargeable[3];
        devices[0] = (new Laptop());
        devices[1] = (new Tablet());
        devices[2] = (new Phone());

        for (Chargeable device : devices) {
            device.charge();
        }
    }
}