package sector03_Construrcor;

public class Constructor_07_Car {
    // 필드
    String company = "Hyundai";
    String model;
    String color;
    int maxSpeed;

    // 생성자
    Constructor_07_Car () {}

    Constructor_07_Car(String model) {
        this(model, "은색", 250);
    }

    Constructor_07_Car(String model, String color) {
        this(model, color, 250);
    }

    Constructor_07_Car(String model, String color, int maxSpeed) { // 앞의 두 생성자를 호출해 중복 코드 줄임
        this.model = model;       //
        this.color = color;       // 공통 실행 코드구역
        this.maxSpeed = maxSpeed; //
    }

}
