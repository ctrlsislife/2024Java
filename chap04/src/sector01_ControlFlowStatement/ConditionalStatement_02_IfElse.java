package sector01_ControlFlowStatement;

public class ConditionalStatement_02_IfElse {
    public static void main(String[] args) {
        // if else 문

        // 모식도
        // if ( 조건식 ) {
        //
        //      실행문A
        //
        //  } else {

        //    실행문B

        //  }
        //  실행문C

        //  if 조건식이 true이면 실행문A 이후 실행문 C 실행
        //  if 조건식이 false이면 실행문B 이후 실행문 C 실행

        int score = 85;

        if(score>=90) {
            System.out.println("Your score higher than 90.");
            System.out.println("Your grade is A");
        } else { // 90보다 작을 경우
            System.out.println("Your score more less than 90.");
            System.out.println("Your grade is B");
        }
    }
}
