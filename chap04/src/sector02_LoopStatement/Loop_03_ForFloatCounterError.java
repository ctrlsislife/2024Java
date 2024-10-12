package sector02_LoopStatement;

public class Loop_03_ForFloatCounterError {
    public static void main(String[] args) {
        // for문 작성시 초기화식에서 루프 카운터 변수 선언시 float 사용 하면 안됨
        for(float x=0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);
            // 이론적으로 이 for문은 0.1 부터 1.0까지 총 10번을 반복해야한다
            // 결과는 9번만 실행된 것을 볼 수 있다
            // 0.1은 float 타입으로 정확하게 표현할 수 없어 0.1보다 약간 큰 값을 인식하기 대문이다
        }
    }
}
