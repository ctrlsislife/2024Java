package sector01_ReferencePart;

public class Reference_02_Null {
    public static void main(String[] args) {
        // 참조 변수는 힙 영역의 객체를 참조하지 않는 상태인 null로 만들 수 있다.
        // 참조 변수가 null을 가질 경우 참조 객체가 없어 변수를 통해 객체를 사용할 수 없다.
        // 이 상태에서 배열 변수(참조 변수)의 객체(할당 되지도 않음)를 활용하는 코드를 실행하면 NullPointerException이 발생한다.

        int[] intArray = null;
        intArray[0] = 10; //Null.PointerException 발생
        // 배열에 10을 저장하려고 하지만 intArray 변수가 참조하는 배열 객체가 존재하지 않아 삽입 불가
    }
}
