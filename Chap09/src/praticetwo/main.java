package praticetwo;

public class main {
    public static void main(String[] args) {
        Button callButton = new Button(); // 콜버튼 누르면 전화를 거세요
//        CallListener callListener = new CallListener();
//        callButton.SetOnClickListener(callListener);
        callButton.SetOnClickListener(new CallListener());  // 주석 처리 부분이 살아났을때와 같은 코드
        callButton.Touch();

        Button messageButton = new Button();
//        MessageListener messageListener = new MessageListener();
//        messageButton.SetOnClickListener(messageListener);
        messageButton.SetOnClickListener(new MessageListener());
        messageButton.Touch();
    }
}
