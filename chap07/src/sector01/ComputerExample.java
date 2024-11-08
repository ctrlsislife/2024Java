package sector01;
// 메소드 재정의
// 자식 클래스가 사용하기에 적합하지 않은 일부 부모클래스의 메소드를 적합하도록 수정해주는 것
public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원면적 : " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원면적 : " + computer.areaCircle(r));
    }
}
