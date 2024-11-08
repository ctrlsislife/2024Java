package study;

public class Truck extends Car {
    public double speed;

    public double load;

    Truck(double speed)
    {
        super(10);
        this.speed = speed;
    }
    public void ShowSpeed(){
        System.out.println("Truck speed: " + speed);
    }


    public void Showload(){
        System.out.println("Current load: " + load);
    }
}
