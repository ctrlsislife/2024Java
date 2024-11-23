package sector01NestedClassInterface.OutterLocalClass;

public class Outter {
        String field = "Outter-field";
        void method() {
            System.out.println("Outter-method");
        }

        class Nested {
            String field = "Nested-field";
            void method() {
                System.out.println("Nested-method");
            }
            void print() {
                System.out.println(this.field);          // 내부 클래스 필드 접근
                this.method();                           // 내부 클래스 메서드 호출
                System.out.println(Outter.this.field);   // 외부 클래스 필드 접근
                Outter.this.method();                    // 외부 클래스 메서드 호출
            }
        }
    }



