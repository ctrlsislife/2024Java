package sector01NestedClassInterface.ButtonBox;

public class ButtonExample {
        public static void main(String[] args) {
            Button btn = new Button();

            btn.setOnClickListener(new CallListener()); // CallListener 설정
            btn.touch(); // CallListener의 onClick 호출

            btn.setOnClickListener(new MessageListener()); // MessageListener 설정
            btn.touch(); // MessageListener의 onClick 호출
        }
    }



