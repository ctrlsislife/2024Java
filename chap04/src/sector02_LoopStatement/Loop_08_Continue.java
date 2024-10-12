package sector02_LoopStatement;

public class Loop_08_Continue {
    public static void main(String[] args) {
        // continue 문은 반복문 내에서 사용된다.
        // continue 문이 실행되면 for문의 증감식 또는 while문의 조건식으로 이동한다.
        // 특정 조건을 만족하는 경우 continue 문을 통해 그 이후 문장을 실행하지 않고 다음 반복을 수행하는 트릭이 주로 쓰인다.

        // 1에서 10 사이의 수 중 짝수만 출력하는 코드
        for(int i=1; i<=10; i++) {
            if(i%2 != 0) { // 2로 나눈 나머지가 0이 아니면 ( 홀수 이면)
                continue; // 조건식 및 증감식으로 이동
            }
            System.out.println(i); // 홀수는 실행되지 않음
        }
    }
}
