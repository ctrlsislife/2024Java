package sector01_javaDotLangPackage;
// 객체 해시코드란 객체를 식별하는 하나이 정수값
//  obj 클래스의 hasoCode() 가 객체의 메모리 번지를 이용해서 해시코드를 만ㄷ르얼 리턴하여 객체마다 다른 값을 가짐
public class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key) {
            Key compareKey = (Key) obj;
            if(this.number == compareKey.number) {
                return true;
            }
        }
        return false;
    }


}
