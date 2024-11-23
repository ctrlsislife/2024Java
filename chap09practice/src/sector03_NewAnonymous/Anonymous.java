package sector03_NewAnonymous;



public class Anonymous {
    // 필드 초기값으로 익명 객체 대입
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다."); // 필드 익명 객체가 수행하는 turnOn() 구현
        }
        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다."); // 필드 익명 객체가 수행하는 turnOff() 구현
        }
    };

    void method1() {
        // 로컬 변수에 익명 객체 대입
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Audio를 켭니다."); // 로컬 익명 객체가 수행하는 turnOn() 구현
            }
            @Override
            public void turnOff() {
                System.out.println("Audio를 끕니다."); // 로컬 익명 객체가 수행하는 turnOff() 구현
            }
        };
        // 로컬 변수의 메서드 호출
        localVar.turnOn(); // "Audio를 켭니다." 출력
    }

    void method2(RemoteControl rc) {
        rc.turnOn(); // 전달받은 익명 객체의 turnOn() 메서드 호출
    }
}


