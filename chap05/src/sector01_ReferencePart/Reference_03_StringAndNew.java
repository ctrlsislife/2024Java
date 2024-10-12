package sector01_ReferencePart;

public class Reference_03_StringAndNew {
    public static void main(String[] args) {

        // 자바에서 문자열을 저장하고자 하는 경우 String 변수를 우선 선언해야 한다.

        // String 변수의 작동 원리
        // 문자열이 직접 변수에 저장되는 것이 아닌 문자열은 String 객체로 생성되고 변수는 이 String 객체를 참조하는 것임
        // 선언 방법 1.
        String var1;
        var1 = "Euiheon Ahn";

        // 선언 방법 2.
        String var2 = "안의헌";

        // new 연산자 (객체 생성 연산자)
        // 일반적으로 변수에 문자열을 저장하려고 하면 문자열 리터럴을 사용하지만 new 연산자 통해 직접 String 객체를 생성할 수 있다.
        String name1 = new String("Euiheon Ahn");
        String name2 = new String("Euiheon Ahn");
        // 이때 name1과 name2는 각각 생성되어 서로 다른 string 객체를 참조하고 있다.

        // 확인
        if (name1 == name2) {
            System.out.println(true);
        } else
            System.out.println(false);
        // 문자열의 내용이 같으나 각각 생성된 객체이기에 다른 주소를 참조하여 false가 표출됨을 알 수 있다.
    }
}
