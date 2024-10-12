package sector01_ControlFlowStatement;

public class ConditionalStatement_05_Switch {
    public static void main(String[] args) {
        // Switch 문 : 변수가 어떤 값을 갖느냐에 따라 실행문 결정
        // : if 문 : 조건식이 true일 경우 블록 내부의 실행문 실행
        // Switch (변수) 선언 후 case 1 , case 2 이렇게 해당하는 변수가 걸리도록 조건 나열
        // 즉, 스위치문은 괄호 안의 변수 값과 동일 한 값을 갖는 case로 가 실행문을 실행함
        // case 조건식 작성시 실행문 실행 후 다음 case를 실행하지 않고 종료되도록 break; 필수
        // 단
        // 괄호 안의 변수 값과 동일한 값을 갖는 case가 없으면 마지막인 default 로 가서 실행문 실행함.

        int num = (int) (Math.random() * 6) + 1;  // 주사위 번호 뽑는 코드

        switch(num) { // Switch(변수) 형태
            case 1:
                System.out.println("Your Dice is 1");
                break;

            case 2:
                System.out.println("Your Dice is 2");
                break;

            case 3:
                System.out.println("Your Dice is 3");
                break;

            case 4:
                System.out.println("Your Dice is 4");
                break;

            case 5:
                System.out.println("Your Dice is 5");
                break;

            default:
                System.out.println("Your Dice is 6");
                break;
        }
    }
}
