package study;

public class Truck extends Car {
    public double speed;
    Truck(double speed)
    {
        super(10);
        this.speed = speed;
    }
    public void ShowSpeed(){
        System.out.println("Truck speed: " + speed);
    }
}
