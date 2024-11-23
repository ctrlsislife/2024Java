package Practicefour;

public class Worker extends Person {
    void work(){
        System.out.println("Worker is working.");
    }

    void wake() {
        System.out.println("Wake up at 6");
        work();
    }
}
