package sector02_LoopStatement;

public class Loop_05_While {
    public static void main(String[] args) {
        // while : 조건식이 참일 경우에 계속 반복
        // 조건식이 거짓이 되면 반복 행위를 멈추고 while을 종료

        // for문은 정해진 횟수만큼 반복하는 형태임

        //while 문의 형태
        // while ( 조건식 )  {
        //
        //     실행문;
        // }
        // 동작 순서
        // 1) while문이 처음 실행될 때 조건식을 평가함
        // 2) 평가 결과가 참이면 실행문을 실행함
        // 3) 실행문이 모두 실행되면 조건식으로 되돌아가서 다시 조건식을 평가함
        // 4) 조건식이 또 참이면 일련의 과정을 반복
        // 5) 비로소 조건식이 거짓이 되면 while 문을 종료

        int sum = 0;

        int i = 1;

        while(i<=100) {
            sum += i;
            i++;
        }
        System.out.println("1~" + (i-1) + "합 : " + sum);
        // 조건식에는 어떠한 연산식이 올 수 있어 만약 조건식에 true를 사용하면 무한 루프에 빠지게 됨
        // 그럴때는 break문을 사용해 빠져나갈 수 있도록 조치해주어야함.
    }
}
