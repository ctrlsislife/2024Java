package Practices;

public class DryTire implements Tire {
    int HighPerformance = 100;
    int speed = 0;

    public void SetData(int speed, int distance){
        this.speed = speed;
    }

    public boolean NeedChange() {
        if(speed > HighPerformance)
            return true;
            else
                return false;
        }
    }

