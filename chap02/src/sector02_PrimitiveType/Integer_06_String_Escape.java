package sector02_PrimitiveType;

public class Integer_06_String_Escape {
    public static void main(String[] args) {


        // 이스케이프 문자를 사용하면 문자열 내부에 특정 몬자를 포함시킬 수 있다.
        // 이를테면 큰따옴표는 문자열 식별 기호이지만 데이터로써 큰따옴표를 사용하기 위하여 이스케이프 문 \"를 사용해야한다.

        System.out.println("번호\t이름\t직업");  // 이스케이프 문자(\t) : 탭 만큼 띄움
        System.out.println("행 단위 출력\n"); // 이스케이프 문자(\n) : 줄 바꿈
        System.out.println("우리는 \"개발자\" 입니다.");  // 이스케이프 문자(\") : " 출력
        System.out.println("봄\\여름\\가을\\겨울");        // 이스케이프 문자(\\) : \ 출력
    }
}
