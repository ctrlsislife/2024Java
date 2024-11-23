package sector02_Anonymous;

public class AnonymousExample {
        public static void main(String[] args) {
            // Anonymous 클래스의 객체 생성
            Anonymous anony = new Anonymous();

            // 1. 필드에 정의된 익명 객체 사용
            anony.field.wake();
            // 출력: "6시에 일어납니다." -> "출근합니다."

            // 2. 로컬 변수로 정의된 익명 객체 사용
            anony.method1();
            // 출력: "7시에 일어납니다." -> "산책합니다."

            // 3. 매개값으로 전달된 익명 객체 사용
            anony.method2(
                    new Person() {
                        void study() {
                            // study() 메서드: "공부합니다." 출력
                            System.out.println("공부합니다.");
                        }

                        @Override
                        void wake() {
                            // wake() 메서드 재정의: "8시에 일어납니다." 출력 후 study() 호출
                            System.out.println("8시에 일어납니다.");
                            study();
                        }
                    }
            );
            // 출력: "8시에 일어납니다." -> "공부합니다."
        }
    }


