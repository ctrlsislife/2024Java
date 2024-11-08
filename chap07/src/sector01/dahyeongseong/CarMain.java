package sector01.dahyeongseong;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car(); // 자동차 객체 생성

        for(int i=1; i<=5; i++) { // 자동차 객체의 run() 메소드 5번 반복
            int problemLocation = car.run();


            switch(problemLocation) { // 마모한계도달시 스위치 문
                case 1:
                    System.out.println("앞왼쪽 한국타이어로 교체");
                    car.FrLfTire = new HankookTire("앞왼쪽 ", 15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 금호타이어로 교체");
                    car.FrRiTire = new KumhoTire("앞오른쪽", 13);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 한국타이어로 교체");
                    car.bcLfTire = new HankookTire("뒤왼쪽", 14);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 금호타이어로 교체");
                    car.bcRiTire = new KumhoTire("뒤오른쪽", 17);
                    break;
            }
            System.out.println("---------------------------"); // 1회전시 출력되는 내용 구분
        }
    }
}
