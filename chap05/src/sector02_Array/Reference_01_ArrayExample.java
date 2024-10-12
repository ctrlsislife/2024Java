package sector02_Array;

public class Reference_01_ArrayExample {
    public static void main(String[] args) {
        // 배열 : 같은 타입의 데이터를 연속된 공간에 나열하고 각 데이터에 인덱스를 부여해 놓은 것
        // 배열명[인덱스] 형식이다

        // 첫번째 점수는 83, 두번째 점수는 90, 세번째 점수는 87이라 할때 성적을 배열로 만들면
        // 성적의 평균값은 배열의 인덱스를 활용해 for문으로 쉽게 구할 수 있게 된다.

        int[] score = { 83, 90, 87};
        int sum = 0;
        for(int i=0; i<30; i++) {
            sum += score[i];
        }
        int avg = sum / 30;
        System.out.println("The average score is: " + avg);
    }
}
