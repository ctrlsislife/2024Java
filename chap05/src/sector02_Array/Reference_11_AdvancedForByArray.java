package sector02_Array;

public class Reference_11_AdvancedForByArray {
    public static void main(String[] args) {
        // 배열을 활용한 향상된 for문
        // 기존 for문과 달리 반복 실행을 위해 루프 카운터 변수와 증감식을 사용하지 않음.
        // for 괄호 안에는 배열에서 꺼낸 항목을 저장할 변수 선언 : 배열
        // 배열의 개수만큼 반복하고 for문을 빠져나감
        // for ( 타입 변수 : 배열)

        int[] scores = {95, 71, 84, 93, 87 }; // 배열 생성

        int sum = 0; // 점수 총합을 0으로 초기화
        for(int score : scores) { // 배열 scores의 각 요소를 순차적으로 반복
            // int score: scores 배열의 각 요소(점수)를 하나씩 score 변수에 담음
            sum = sum + score; // 현재 sum에 배열의 각 점수를 더한다. 그러면 sum은 모든 점수의 총합이 된다.
        }
        System.out.println("점수 총합 = " + sum);

        double avg = (double) sum / scores.length; // 정수형 sum을 double 타입으로 변환해 부동 소수점 단위로 표현
        System.out.println("점수 평균 = " + avg);

        // for 문의 반복 횟수는 배열의 항목 수
    }
}
