package sector03_NewAnonymous;


public class AnonymousExample {
        public static void main(String[] args) {
            Anonymous anony = new Anonymous(); // Anonymous 객체 생성

            // 1. 익명 객체 필드 사용
            anony.field.turnOn(); // "TV를 켭니다." 출력

            // 2. 익명 객체 로컬 변수 사용
            anony.method1(); // "Audio를 켭니다." 출력

            // 3. 익명 객체를 매개값으로 사용
            anony.method2(
                    new RemoteControl() { // method2() 호출 시 즉석에서 정의한 익명 객체
                        @Override
                        public void turnOn() {
                            System.out.println("SmartTV를 켭니다."); // 매개값 익명 객체가 수행하는 turnOn() 구현
                        }
                        @Override
                        public void turnOff() {
                            System.out.println("SmartTV를 끕니다."); // 매개값 익명 객체가 수행하는 turnOff() 구현
                        }
                    }
            );
        }
    }


