package sector01_ControlFlowStatement;

public class ConditionalStatement_06_SwitchChar {
    public static void main(String[] args) {
        // char 타입 변수를 이용해 알파벳 대소문자에 관계없이 동일하게 처리하도록 만든 switch

        char grade = 'B';

        switch(grade) {
            case 'A':
            case 'a':
                System.out.println("VIP membership");
                break;

            case 'B':
            case 'b':
                System.out.println("General membership");
                break;

            default:
                System.out.println("Invalid membership");
        }
    }
}
