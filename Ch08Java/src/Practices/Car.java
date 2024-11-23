package Practices;

public class Car {
//    WetTire frontLeftTire = new WetTire();
//    WetTire frontRightTire = new WetTire();
//    DryTire backLeftTire = new DryTire();
//    DryTire backRightTire = new DryTire(); // 코드가 길어지면 관계가 복잡해져 타이어는 인터페이스를 통해 다형성 만듦
// 타이어도 규격이 정의되어 있으므로 Car에서 타이어에 대한

    Tire frontLeftTire;
    Tire frontRightTire;
    Tire backLeftTire;
    Tire backRightTire;


    Car() {
        this.frontLeftTire = new WetTire();
        this.frontRightTire = new WetTire();
        this.backLeftTire = new WetTire();
        this.backRightTire = new WetTire();
    }

    public void SetData(int speed, int distance) {
        frontLeftTire.SetData(speed, distance);
        frontRightTire.SetData(speed, distance);
        backLeftTire.SetData(speed, distance);
        backRightTire.SetData(speed, distance);

    }

    public boolean NeedChangeTire () {
        if(frontLeftTire.NeedChange()) return true;
        else if(frontRightTire.NeedChange()) return true;
        else if(backLeftTire.NeedChange()) return true;
        else if(backRightTire.NeedChange()) return true;
        else return false;
    }
}
