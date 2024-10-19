package sector03_Construrcor;

import java.sql.SQLOutput;

public class Constructor_08_CarMain {
    public static void main(String[] args) {
        Constructor_07_Car car1 = new Constructor_07_Car();
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        Constructor_07_Car car2 = new Constructor_07_Car("Sedan");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();

        Constructor_07_Car car3 = new Constructor_07_Car("Sedan", "Black");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        Constructor_07_Car car4 = new Constructor_07_Car("Taxi","Black",200);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
    }
}
