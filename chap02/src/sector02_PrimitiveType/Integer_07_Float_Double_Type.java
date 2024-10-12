package sector02_PrimitiveType;

public class Integer_07_Float_Double_Type {
    public static void main(String[] args) {

        // 자바는 실수 리터럴을 기본적으로 double 타입으로 인식한다.
        // 따라서 실수 리터럴을 float 타입 변수에 저장하면 컴파일 에러가 발생한다.
        // 실수 리터럴을 float로 저장하고 싶다면 리터럴 뒤에 F를 붙여 float 타입임을 알 수 있도록 하여야 한다.

        // 실수 리터럴 저장
        // float var1 = 3.14; // 잘못된 코드 , 컴파일 에러 발생 F 안붙임
        float var2 = 3.14f;
        double var3 = 3.14;

        // 표현 정밀도 테스트
        float var4 = 0.1234567890123456789f;  // 소수점 이하 7자리 까지 표현
        double var5 = 0.1234567890123456789;  // 소수점 이하 15자리까지 표현
        // double이 더 정확한 데이터 저장하므로 자원이 여유로운 경우 double 기본 사용

        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);

        // 자릿수 나타내는 e 사용하기
        double var6 = 3e6;
        float var7 = 3e6F;
        double var8 = 2e-3;
        System.out.println("var6: " + var6);
        System.out.println("var7: " + var7);
        System.out.println("var8: " + var8);
    }
}
