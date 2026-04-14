public class Sedan extends Vehicle implements Automobile {

    public void accelerate() {
        System.out.println("sedan is accelerating");
    }
    public void accelerate(int howFast) {
        System.out.println("sedan is specifically accelerating to " + howFast + " speed");
    }
    public void stop() {
        System.out.println("sedan stopped.");
    }
    public void gas() {
        System.out.println("filling sedan up with gas.");
    }
    public void startCar() {
        System.out.println("sedan Engine is ON.");
    }
    public void turnOffCar() {
        System.out.println("sedan Engine is OFF.");
    }
}
