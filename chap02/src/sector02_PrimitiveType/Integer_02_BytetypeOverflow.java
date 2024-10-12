package sector02_PrimitiveType;

public class Integer_02_BytetypeOverflow {
    public static void main(String[] args) {

        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        //byte var6 = 128; // byte type 허용 범위 -128 ~ 127 초과 >> 컴파일 에러

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }
}
