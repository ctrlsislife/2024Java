package sector01_ControlFlowStatement;

public class ConditionalStatement_07_SwitchString {
    public static void main(String[] args) {
        // String 타입 변수를 이용해 Switch 문으로 직급별 월급 출력

        String position = "과장";

        switch (position) {
            case "부장":
                System.out.println("700만원");
                break;
            case "과장":
                System.out.println("500만원");
                break;
            default:
                System.out.println("300만원");
        }
    }
}
