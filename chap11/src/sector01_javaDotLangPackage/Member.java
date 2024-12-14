package sector01_javaDotLangPackage;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj; // 멤버 타입으로 캐스팅하고 id 필드값 동일한지 검사
            if(id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }



    // id가 동일한 문자열인 경우 같은 해시 코드를 리턴하게 함
    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

