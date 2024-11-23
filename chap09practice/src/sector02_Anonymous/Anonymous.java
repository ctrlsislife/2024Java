package sector02_Anonymous;

public class Anonymous {

        // 필드에 익명 객체를 초기값으로 할당
        Person field = new Person() {
            void work() {
                // work() 메서드: "출근합니다." 출력
                System.out.println("출근합니다.");
            }

            @Override
            void wake() {
                // wake() 메서드 재정의: "6시에 일어납니다." 출력 후 work() 호출
                System.out.println("6시에 일어납니다.");
                work();
            }
        };

        void method1() {
            // 로컬 변수로 익명 객체 생성
            Person localVar = new Person() {
                void walk() {
                    // walk() 메서드: "산책합니다." 출력
                    System.out.println("산책합니다.");
                }

                @Override
                void wake() {
                    // wake() 메서드 재정의: "7시에 일어납니다." 출력 후 walk() 호출
                    System.out.println("7시에 일어납니다.");
                    walk();
                }
            };

            // 로컬 변수의 wake() 호출
            localVar.wake();
        }

        void method2(Person person) {
            // 매개변수로 전달된 객체의 wake() 호출
            person.wake();
        }
    }


