package sector01_javaDotLangPackage;

import java.util.HashMap;

public class KeyExample {
    // member 필드값 자체는 같지만 hashCode()메소드에서 리턴하는 해시코드가 달라서 다른 것으로 인식해서 null 출력
    public static void main(String[] args) {
        //Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        //식별키 "new Key(1)" 로 "홍길동"을 저장함
        hashMap.put(new Key(1), "홍길동");

        //식별키 "new Key(1)" 로 "홍길동"을 읽어옴
        String value  = hashMap.get(new Key(1));
        System.out.println(value);
    }
}



