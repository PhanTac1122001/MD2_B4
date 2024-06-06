package ThucHanh.ThucHanh2;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.display();


        Student student2 = new Student("S001", "John Doe", "Male", "Class A", 18, "123 Main St");
        student2.display();
    }
}
