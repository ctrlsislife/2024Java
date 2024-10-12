package sector02_Array;

public class Reference_10_Arraycopy {
    public static void main(String[] args) {
        //arraycopy() 통한 복사
        // 호출 방법: System.arraycopy(원본 배열, 원본배열서 복사할 항목의 시작 인덱스,새 배열, 새 배열에서 붙여넣을 시작 인덱스, 복사할 개수)
        // ex) 원본 배열이 arr1 , 새 배열이 arr2이고 arr1의 모든 항목을 복사하려면
        // System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        String[] oldStrArray = { "java", "array", "copy"}; // 이전 배열
        String[] newStrArray = new String[5]; // 5개 담을 수 잇는 새 배열 생성

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        // 이전 배열의 모든 값을 새 배열에 대치(복사)

        for(int i=0; i<newStrArray.length; i++) {
            System.out.println(newStrArray[i] + ", "); // 새 배열의 항목 출력
        }
    }
}
