package sector02_Array;

public class Reference_05_ArrayLength {
    public static void main(String[] args) {
        // 배열의 길이 : 배열에 저장할 수 있는 전체 항목의 개수
        // 배열의 길이를 반환 : 배열 변수.length;

        int[] scores = {83, 90, 87 };

        int sum = 0;
        for(int i=0; i<scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);

        double avg = (double)sum/scores.length;
        System.out.println("평균 : " + avg);
    }
}
