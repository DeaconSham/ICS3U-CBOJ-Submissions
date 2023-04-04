import java.io.*;
import java.util.*;

public class App {
    public static Scanner ui = new Scanner (System.in);
    public static void main(String[] args) throws Exception {
        Student [] students = new Student [5];
        for (int i = 0; i < 4; i++) {
            students[i] = new Student();
            students[i].fname = ui.nextLine();
            students[i].lname = ui.nextLine();
            students[i].age = Integer.parseInt(ui.nextLine());
            students[i].grade = Integer.parseInt(ui.nextLine());
        }
        System.out.println(students[0].fname);
        System.out.println(students[1].lname);
        System.out.println(students[2].age);
        System.out.println(students[3].grade);
    }
}