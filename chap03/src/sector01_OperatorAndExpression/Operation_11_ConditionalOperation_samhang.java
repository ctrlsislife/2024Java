package sector01_OperatorAndExpression;

public class Operation_11_ConditionalOperation_samhang {
    public static void main(String[] args) {
        // 삼항 연산자 (?: ) : 3개의 피연산자를 필요로 하는 연산자
        // ? 앞의 조건식에 따라 : 앞뒤의 피연산자가 선택됨
        // 작동순서
        // 1) ? 앞의 조건식을 연산하여 true가 나오면 삼항 연산자의 결과는 피연산자 2가 됨
        // 2) 반면 조건식을 연산하여 false가 나오면 삼항 연산자의 결과는 피연산자 3가 됨

        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
        System.out.println(score + "점은 " + grade + "등급입니다.");
        // 1) 조건식 (score>90)을 연산하면 false가 나오므로 : 뒤의 조건식으로 넘어감
        // 2) : 뒤의 조건식 (score >80)을 연산하면 true가 나오므로 : 앞의 'B' 값을 가짐
    }
}
