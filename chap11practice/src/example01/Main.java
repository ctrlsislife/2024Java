package example01;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Member m1 = new Member(92);


        HashMap<Member, String> student = new HashMap<Member, String>();
        student.put(m1, "Ahn");


        Member m2 = new Member(92); // null
        System.out.println("Name is" + student.get(m2));




        if(m1 == m2)
            System.out.println("Id is equal.");

        if(m1.equals(m2))
            System.out.println("Id is equal.");
        else
            System.out.println("Id is not equal.");



        String name1 = "Main";
        String name2 = new String("Main");
        String name3 = "Main";

        if(name1 == name2)
            System.out.println("name2 equal");
        if(name1 == name3)
            System.out.println("name3 equal");
        if(name1.equals(name2))
            System.out.println("name2 equal");
        if(name1.equals(name3))
            System.out.println("name3 equal");

    }
}
