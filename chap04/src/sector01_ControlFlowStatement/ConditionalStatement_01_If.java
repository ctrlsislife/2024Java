package sector01_ControlFlowStatement;

public class ConditionalStatement_01_If {
    public static void main(String[] args) {
        // if문 : 조건식의 결과에 따라 블록 실행 여부가 결정
        // if ( 조건식 ) {
        //
        //    실행문 A
        //  }
        //  실행문B
        //  결과 : 위에서부터 순차수행되므로 조건식이 true이면 실행문 A를 , 조건식이 false면 실행문 B를 실행시킴

        int score = 93;

        if(score>=90) {
            System.out.println("Your score is correct");
            System.out.println("Your grade is A");
        }

        if(score<80)
            System.out.println("Your score is incorrect");
            System.out.println("Your grade is Under A"); // 점수가 높던 말던 실행되는 아찔한 결과 발생
        // 20라인의 if문에 중괄호 블록이 없어 바로 다음줄인 21줄 까지만 20라인의 if문으로 동작하고 22라인의 실행문은 아무 관련이 없어졌음

    }
}
