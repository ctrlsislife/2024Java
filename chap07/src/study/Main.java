package study;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(80);
        truck.ShowSpeed();

        Car car = truck;
        car.ShowSpeed(); 
//        트럭의 속도가 출력되는 이유
//        오버라이딩
//        부모 메소드를 상속받아 재정의하면
//        부모를 레퍼런스하여 실행해도
//        자식이 실행된다. (프레임워크의 기본 원리 ex 버튼)
    }
}