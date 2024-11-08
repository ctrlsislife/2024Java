package sector01.Abstract;


    //  class 앞에 abstract 붙이면 추상 클래스가 됨
        public abstract class Phone {
            // field
            public String owner;

            // 생성자
            public Phone(String owner) {
                this.owner = owner;
            }

            // Method
            public void turnOn() {
                System.out.println("Phone Power On");
            }
            public void turnOff() {
                System.out.println("Phone Power Off");
            }
        }