package sector01_ControlFlowStatement;

public class ConditionalStatement_03_IfElseIfElse {
    public static void main(String[] args) {
        // if else 문
        // 조건문이 여러개인 if문 형태
        // 수는 제한이 없다
        // 여러 조건식 중 true가 되는 블록만 실행하고 전체 if문을 탈출함
        // elseif 블록 마지막에 else블록을 추가한다면 모든 조건식이 false일 경우 else 블록을 실행해 if문을 탈출함

        int score = 75;

        if(score>=90) {
            System.out.println("You got a score of 100~ 90");
            System.out.println("Your garde is A");
        } else if(score>=80) {
            System.out.println("You got a score of 89~80");
            System.out.println("Your garde is B");
        } else if(score>=70) {
            System.out.println("You got a score of 79~70");
            System.out.println("Your garde is C");
        } else {
            System.out.println("You got a score under 70");
            System.out.println("Your garde is D");
        }
    }
}
