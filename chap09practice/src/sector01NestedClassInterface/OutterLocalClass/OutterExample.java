package sector01NestedClassInterface.OutterLocalClass;

public class OutterExample {
        public static void main(String[] args) {
            Outter outter = new Outter();
            Outter.Nested nested = outter.new Nested(); // 외부 클래스 객체로 내부 클래스 객체 생성
            nested.print();  // 내부 클래스의 print 메서드 호출
        }
    }

