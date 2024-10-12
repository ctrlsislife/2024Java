package sector03_Type_Promotion;

public class Promotion_07_PrimitiveAndStringConversion {
    public static void main(String[] args) {


        // 문자열을 기본 타입(primitive)으로 변환하기


        // 문자열을 각 기본 타입으로 변환하기
        int value1 = Integer.parseInt("10");  // Integer.parseInt (문자열을 정수 int 타입으로 변환)
        double value2 = Double.parseDouble("3.14");  // Double.parseDouble (문자열을 실수 double타입으로 변환)
        boolean value3 = Boolean.parseBoolean("true"); // boolean.parseBoolean ( 문자열을 불 타입으로 변환)

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        // 기본 타입을 문자열로 변환
        // String str = String.valueof(기본타입값)
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
    }
}
