package sector02_Array;

public class Reference_08_ArrayReferenceObject {
    public static void main(String[] args) {
        // 객체를 참조하는 배열 : 참조 타입의 배열은 각 항목에 기본 타입 배열과 달리 객체의 번지를 가지고 있다.
        // 즉, String[] 배열은 String 객체를 참조하고 있는 것임.
        // 기본 타입의 배열은 각 항목에 직접 값을 가지고 있음.

        // 따라서 String[]배열 또한 String변수와 같이
        // 문자열 비교를 위해선 equals(), 객체 번지수 비교를 위해선 ==를 사용해야 한다.

        String[] strArray = new String[3];
        strArray[0] = "AEH";
        strArray[1] = "AEH";
        strArray[2] = new String("AEH");

        System.out.println(strArray[0] == strArray[1]); // true (같은 객체 참조)
        System.out.println(strArray[0] == strArray[2]); //  false(다른 객체 참조)
        System.out.println(strArray[0].equals(strArray[2])); // true(같은 문자열)
    }
}
