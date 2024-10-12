package sector02_Array;

public class Reference_09_ArrayCopyByFor {
    public static void main(String[] args) {
        // 배열의 복사
        // 배열은 한번 생성시 크기 변경이 불가
        // 따라서 더 큰 배열을 원한다면 배열을 새로 만들고 이전 배열로부터 항목 값을 복사해야한다.

        // 배열 항목 복사 2가지 방법
        // 1. for문
        // 2. System.arraycopy()

        //for문으로 배열 복사하기
        int[] oldIntArray = { 1, 2, 3 }; // 기존 배열
        int[] newIntArray = new int[5];  // 새로 생성한 배열

        for(int i=0; i<oldIntArray.length; i++) { // 기존 배열 값들 호출
            newIntArray[i] = oldIntArray[i];  // 기존 배열 값들을 새로운 배열로 대치(복사)
        }

        for(int i=0; i<newIntArray.length; i++) {
            System.out.print(newIntArray[i] + " "); // 새로운 배열의 입력 값 목록 출력
        }
    }
}
