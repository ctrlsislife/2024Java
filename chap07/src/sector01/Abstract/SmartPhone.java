package sector01.Abstract;
// 추상 클래스인 폰을 이용해 자식 클래스인 스마트폰을 정의하였음
public class SmartPhone extends Phone {
    // 생성자
    public SmartPhone(String owner) {
        super(owner);
    }
    // method
    public void internetSearch() {
        System.out.println("인터넷 검색 합니다.");
    }
}
