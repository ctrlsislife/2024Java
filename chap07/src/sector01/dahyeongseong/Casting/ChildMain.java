package sector01.dahyeongseong.Casting;

public class ChildMain {
    public static void main(String[] args) {
        Parent parent = new Child(); // 자동 타입 변환
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//        parent.field2 = "data2";
//        parent.method3(); // 부모로 자동 타입변환되면 자식 필드나 메소드 사용 불가.. 이를 사용하려면 아래처럼 캐스팅해야함

        Child child = (Child) parent;
        child.field2 = "yyy";
        child.method3();
    }
}
