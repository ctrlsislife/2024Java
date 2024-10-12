package sector01_ReferencePart;

public class Reference_01_ReferenceVariable {
    public static void main(String[] args) {


        // 기본 타입 변수의 == 연산 >> 변수의 값이 같은지, 아닌지를 판별하는 것
        int a = 10;
        int b = 10;

        if (a == b) {
            System.out.println("true");
        }

        // 참조 변수에서의 == 연산은 참조하는 번지수가 같은지를 판별하는 것
        String str1 = "Java"; //예시 1000번지
        String str2 = "Java"; // 예시 1000번지
        String str3 = "자바";  // 예시 2000번지

        if (str1 == str2) {
            System.out.println("true"); // str1 1000번지 참조 , str2 1000번지 참조
        } else if (str1 == str3) {
            System.out.println("false"); //str1 1000번지 참조 , str3 2000번지 참조
            // 자바는 문자열 리터럴이 동일하다면 문자열 객체를 공유하도록 되어 있다. 따라서 Java 객체를 하나 생성 후 재활용하여 참조한다.

        }
    }
    }

