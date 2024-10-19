package sector04_Method;

public class Method_08_CarMain {
    public static void main(String[] args) {

        Method_07_Car myCar = new Method_07_Car();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("Speed: " + speed + " km/h");
    }
}
