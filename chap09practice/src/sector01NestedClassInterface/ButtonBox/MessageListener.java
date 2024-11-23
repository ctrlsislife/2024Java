package sector01NestedClassInterface.ButtonBox;

    public class MessageListener implements Button.OnClickListener {
        @Override
        public void onClick() {
            System.out.println("메시지를 보냅니다."); // 버튼 클릭 시 출력
        }
    }



