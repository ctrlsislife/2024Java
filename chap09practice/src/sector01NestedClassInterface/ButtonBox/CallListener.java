package sector01NestedClassInterface.ButtonBox;


public class CallListener implements Button.OnClickListener {
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다."); // 버튼 클릭 시 출력
        }
    }


