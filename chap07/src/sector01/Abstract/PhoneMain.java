package sector01.Abstract;

public class PhoneMain {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
