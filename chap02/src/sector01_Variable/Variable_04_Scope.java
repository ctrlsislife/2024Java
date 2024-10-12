package sector01_Variable;

public class Variable_04_Scope {
    public static void main(String[] args) {

        int v1 = 15;
        if(v1>10) {
            int v2;
            v2 = v1 - 10;
        }
       // int v3 = v1 + v2 + 5;  구동 위해 컴파일시 주석 제거
        // v2가 if 함수 내 로컬영역에서 선언된 변수이기에 11라인에서 v2를 사용할 수 없어 컴파일 에러 발생
    }
}
