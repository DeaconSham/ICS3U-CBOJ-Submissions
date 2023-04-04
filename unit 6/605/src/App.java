public class App {

    public static void main(String[] args) {

        // Instance of Student using default constructor
        Student s1 = new Student();

        // Instance of Student using constuctor 2
        Student s2 = new Student("William Gates", 11, 16);

        // Instance of Student using constructor 3
        Student s3 = new Student("Steven Jobs");

        s1.print();
        s2.print();
        s3.print();

    }
}