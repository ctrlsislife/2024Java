package example02;

public class Main {
    public static void main(String[] args) {
        
        Main m = new Main();
        
        Student student = new Student("Ahn" , 99);

        // System.out.println(student.toString()); // object에 있는 toString을 실행
        
        m.ShowInfo(student);
        
        Worker worker = new Worker();
        m.ShowInfo(worker);
        
        
    }




    public void ShowInfo (Object obj) {
        System.out.println("Object name : " + obj.toString());
    }
}
