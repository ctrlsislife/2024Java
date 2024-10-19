package sector03_Construrcor;

public class Constructor_04_KoreanMain {
    public static void main(String[] args) {

        // 객체 생성 후 필드값 출력
        Constructor_03_Korean k1 = new Constructor_03_Korean("박자바", "011225-1234567");
        System.out.println("k1의 이름은 : " + k1.name);
        System.out.println("k1의 주민등록번호는 : " + k1.ssn);

        Constructor_03_Korean k2 = new Constructor_03_Korean("김자바", "930525-0666554321");
        System.out.println("k2의 이름은: " + k2.name);
        System.out.println("k2의 주민등록번호는 : "  + k2.ssn);
    }
}
