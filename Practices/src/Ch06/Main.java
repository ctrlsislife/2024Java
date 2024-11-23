package Ch06;

public class Main {
    public static void main(String[] args) {


        // Car.ShowMaxSpeed(); 지금은 힙 영역에 아무거도 있지 않아 컴파일 에러 발생


       // Car car = new Car(); // car라는 4바이트 변수가 main 함수 주버니에 만들어지고 new에 의해 힙영역에 company model maxspeed 필드를 담는 클래스가 만들어짐
        // 힙에 메모리 영역이 생긴 후에 필드를 활용할 수 있다.


        // new 다음에 오는 것이 생성자 함수(car class 참조)
        Car car1 = new Car("Bugatti" ,"Veyron", 400, 0);
        Car car2 = new Car("Benz", "S63 AMG", 280, 0);
        Car car3 = new Car();
        Car car4 = new Car("Hyundai");
        //Car car3 = new Car(); // 원래는 돌아가야 맞지만 생성자를 하나라도 만드는 순간 그 이후엔 컴파일러가 자동으로 생성자를 만들지 않음.
        /* 이게 돌아가려면 car 클래스에서
        car() {
            company = ""
            model =""
            maxspeed = 0
            speed = 0
            } 을 따로 정의 해준 후에 컴파일 에러가 발생하지 앟는다.
         */

        //Car.speed = 60;
        //car1.ShowInfo();
        //car2.ShowInfo();
        car3.Showinfo();

        }
    }

