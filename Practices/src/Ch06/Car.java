package Ch06;

public class Car {
    String company;
    String model;
    String manufacturer;

    int maxSpeed = 240;
    int speed = 0;

    Car(String company) {
        this.company = company;
        this.model = "";
        this.maxSpeed = 100;
        this.speed = 0;
    }
    Car(String company, String model)
        this.company = company;
        this.model = model;
    }
    Car(String company, String model, int maxSpeed, int speed){
        /* company = company;
        model = model;
        maxSpeed = maxSpeed;
        speed = speed; */ // 이렇게 되면 string 에 입력될 수 없음
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.speed = speed;


    Car() {
            // company = ""; null
            // model = "";  null
            maxSpeed = 100;
            speed = 0;
        }
    }
    // method
    void ShowInfo() {
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Speed: " + speed);
    }
}
