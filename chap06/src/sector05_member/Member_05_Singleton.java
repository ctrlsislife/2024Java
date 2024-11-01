package sector05_member;

public class Member_05_Singleton {
    // 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기능 싱글톤
    // new 연산자로 생성자를 호출할 수 없도록 막음
    // 생성자 앞에 private 접근 제한자 붙임
    private static Member_05_Singleton singleton = new Member_05_Singleton();

    private Member_05_Singleton() {}

    static Member_05_Singleton getInstance() {
        return singleton;
    }
}
