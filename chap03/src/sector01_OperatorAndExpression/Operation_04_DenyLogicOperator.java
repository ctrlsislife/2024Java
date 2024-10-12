package sector01_OperatorAndExpression;

public class Operation_04_DenyLogicOperator {
    public static void main(String[] args) {
        // 논리 부정 연산자(!) : true를 false로, false를 true로 변경한다.
        // 불타입에서만 사용 가능
        // 조건문과 제어문에서 조건식의 값을 부정하도록 하여 실행 흐름을 제어할때 사용
        // 두 상태를 번갈아가며 변경하는 토글 제어 기능도 수행

        boolean play = true;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        play = !play;
        System.out.println(play);
    }
}
