package sector03_Construrcor;

public class Constructor_05_Car {

    // 생성자의 오버로딩
    // 다양한 초기화 요구: 클래스의 객체를 생성할 때 어떤 경우에는 일부 매개변수만으로 초기화하고 싶을 수 있고,
    // 다른 경우에는 모든 매개변수를 이용해 초기화하고 싶을 수 있습니다.
    // 예를 들어, 자동차 객체를 만들 때, 차의 이름과 색깔만 알 때도 있을 수 있고, 이름, 색깔, 엔진 크기까지 알 때도 있을 수 있습니다.
    // 이럴 때, 두 가지 다른 생성자를 사용하여 각각의 상황에 맞게 객체를 생성할 수 있습니다.

    // 필드
    String company = "Hyundai";
    String model;
    String color;
    int maxSpeed;

    // 생성자
    Constructor_05_Car() {} // 생성자 1

    Constructor_05_Car(String model) {  // 생성자 2
        this.model = model;
    }
    Constructor_05_Car(String Model, String Color) {  // 생성자 3
        this.model = Model;
        this.color = Color;
    }

    Constructor_05_Car(String Model, String Color, int MaxSpeed) {  //생성자 4
        this.model = Model;
        this.color = Color;
        this.maxSpeed = MaxSpeed;
    }


}
