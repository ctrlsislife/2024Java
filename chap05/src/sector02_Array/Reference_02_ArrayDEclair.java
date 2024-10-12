package sector02_Array;

public class Reference_02_ArrayDEclair {
    public static void main(String[] args) {
        // 배열의 선언 방법
        // 1. 타입[] 변수;    예시 : int[] intArray;

        // 2. 타입 변수[];    예시 : int intArray[];

        // 값 목록으로 배열 생성하는방법
        // 타입[] 변수 = { 값0, 값1, 값2, 값3, ...};
        int [] scores = { 83, 90, 87 };

        System.out.println("scores[0] : " + scores[0]);  // 배열의 1번째 값
        System.out.println("scores[1] : " + scores[1]);  // 배열의 2번째 값
        System.out.println("scores[2] : " + scores[2]);  // 배열의 3번째 값

        int sum = 0;
        for(int i=0; i<3; i++) {
            sum += scores[i];
        }

        System.out.println("총합 : " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균 : " + avg);
    }
}
