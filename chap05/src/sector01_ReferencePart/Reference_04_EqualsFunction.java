package sector01_ReferencePart;

public class Reference_04_EqualsFunction {
    public static void main(String[] args) {
        // equals() : String 객체 간 내부 문자열을 비교하고자 할때 사용함
        // 사용 방법 :  원본 문자열.equals(비교문자열)

        String name1 = "Ionic 5";
        String name2 = "Ionic 6";
        String name3 = "Ionic 5";

        // equals 사용
        boolean result = name1.equals(name2);
        System.out.println(result);

        boolean result2 = name1.equals(name3);
        System.out.println(result2);
    }
}
