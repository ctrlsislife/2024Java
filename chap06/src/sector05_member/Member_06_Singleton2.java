package sector05_member;

public class Member_06_Singleton2 {
    public static void main(String[] args) {

        // Member_05_Singleton obj1 = new Member_05_Singleton();  만들어지지 않는다

        Member_05_Singleton obj1 = Member_05_Singleton.getInstance();
        Member_05_Singleton obj2 = Member_05_Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println(" 같은 싱글톤 객체입니다.");
        } else{
            System.out.println(" 다른 싱글톤 객체입니다.");
        }
    }
}
