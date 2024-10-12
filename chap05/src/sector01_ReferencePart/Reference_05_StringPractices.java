package sector01_ReferencePart;

public class Reference_05_StringPractices {
    public static void main(String[] args) {

        String strVar1 = "안의헌";
        String strVar2 = "안의헌";

        // 주소값 같은지 판별 (==)
        if(strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 같은 곳을 참조한다.");
        } else {
            System.out.println("strVar1과 strVar2는 다른 곳을 참조한다.");
        }

        // 내부 문자열이 같은지 판별 ( equals() )
        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같다.");
        }

        // new() 사용해 String 객체 생성하기
        String strVar3 = new String("안의헌");
        String strVar4 = new String("안의헌");

        if(strVar3 == strVar4) {
            System.out.println("strVar3와 strVar4는 같은 곳을 참조한다.");
        } else {
            System.out.println("strVar3와 strVar4는 다른 곳을 참조한다.");
        }
    }
}
