package ThucHanh.ThucHanh2;

public class Student {
    private String studentId;
    private String studentName;
    private String sex;
    private String className;
    private int age;
    private String address;

    public Student() {

    }

    public Student(String studentId, String studentName, String sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }


    public void display() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Sex: " + this.sex);
        System.out.println("Class Name: " + this.className);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }
}
