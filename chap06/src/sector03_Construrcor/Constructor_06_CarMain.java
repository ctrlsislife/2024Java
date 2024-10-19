package sector03_Construrcor;

public class Constructor_06_CarMain {
    public static void main(String[] args) {
        Constructor_05_Car car1 = new Constructor_05_Car(); // 생성자 1 사용
        System.out.println("Car1.company : " + car1.company);
        System.out.println();

        Constructor_05_Car car2 = new Constructor_05_Car("Sedan"); // 생성자 2 사용
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();

        Constructor_05_Car car3 = new Constructor_05_Car("Sedan", "Red"); // 생성자 3 사용
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        Constructor_05_Car car4 = new Constructor_05_Car("Taxi", "Black", 200); // 생성자 4 사용
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
        System.out.println();
    }
}
