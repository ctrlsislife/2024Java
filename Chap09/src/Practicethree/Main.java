package Practicethree;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();


//          아래 엠 도트 체크 뉴 파렌트와 같은 의미임
//        Parent parent = new Parent();
//        m.Check(parent);

//        m.Check(new Parent());

        Parent parent = new Child() {
            int age = 10;


            //    parent.age = 20; 안되는 이유 공책에

            public void ShowInfo() {
                System.out.println("My name is " + name);
                System.out.println("My age is " + age);
            }
        };
        m.Check(parent);
    }

    void Check(Parent parent) {
        parent.Showinfo();
    }
}