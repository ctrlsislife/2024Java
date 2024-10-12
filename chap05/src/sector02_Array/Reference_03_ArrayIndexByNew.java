package sector02_Array;

public class Reference_03_ArrayIndexByNew {
    public static void main(String[] args) {

        // new를 통해 값 목록 추가하기
        int[] scores;  // 배열 선언
        scores = new int[] { 83, 90, 87}; // 추후 값 목록 추가 하는법
        int sum1 = 0;
        for(int i =0; i<3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);


        // 메소드(add)의 매개값이 배열인 경우
        // 반드시 new 연산자 사용해 값 목록 추가시켜야 컴파일 오류가 나지 않는다.
        int sum2 = add(new int[]{82, 91, 84});
        System.out.println("총합 : " + sum2);
        System.out.println();
    }
    public static int add(int[] scores) { // 총합을 계산하여 리턴
        int sum = 0;
        for(int i=0; i<3; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
