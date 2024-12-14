package sector01_javaDotLangPackage;

public class BoxingUnboxing {
    public static void main(String[] args) {

        // 기본 타입의 값을 갖는 객체 -> 포장 객체
        // 기본 타입의 값을 내부에 두고 포장하기 때문

        //Boxing  기본 타입 값을 포장 객체로 만듬
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("200");
        Integer obj3 = Integer.valueOf("300");

        //Unboxing  포장 객체에서 기본 타입의 값을 얻어냄
        int value1 = obj1.intValue();
        int value2 = obj2.intValue();
        int value3 = obj3.intValue();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}

