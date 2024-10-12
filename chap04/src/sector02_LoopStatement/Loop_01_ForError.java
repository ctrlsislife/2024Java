package sector02_LoopStatement;

public class Loop_01_ForError {
    //for 문의 형태
    // for( 초기화식 ; 조건식 ; 증감식 ) {
    //
    //         실행문;
    // }

    // 실행 순서
    // 1) for문이 처음 실행될 때 초기화식이 제일 먼저 실행
    // 2) 조건식을 평가하여 참이면 for문 내부의 실행문을 실행하고 거짓이면 for문을 실행하지 않고 종료
    // 3) 블럭 내부의 실행문이 모두 실행되면 증감식을 실행하고 다시 조건식을 평가함
    // 4) 조건식의 평가 결과가 아직도 참이면 실행문 -> 증감식 -> 조건식으로 다시 진행하고 거짓이면 for문 종료

    public static void main(String[] args) {
        // 1부터 100까지 합을 출력하는 코드
        int sum = 0;

        for(int i=1; i<=100; i++) {
            sum += i;
        }
        //System.out.println("1~" + (i-1) + "합 :: " + sum);
        // 이 구역에 System.out.println 문 입력시 컴파일 오류( 로컬 변수 i는 for 문 내부에서만 사용 가능)
    }
}
     // 초기화식이 필요 없을 시 생략 가능
    // 초기화식과 증감식은 둘 이상 있을 수 있고 그럴 시 쉼표로 구분함