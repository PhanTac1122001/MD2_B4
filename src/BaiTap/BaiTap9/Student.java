package BaiTap.BaiTap9;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private String address;
    private String phone;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, boolean gender, String address, String phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputData(Scanner scanner){
        System.out.println("Enter student ID: ");
        studentId=scanner.nextLine();
        System.out.println("Enter student name: ");
        studentName=scanner.nextLine();
        System.out.println("Enter student age: ");
        age=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter student gender: ");
        gender=Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter student address: ");
        address=scanner.nextLine();
        System.out.println("Enter student phone: ");
        phone=scanner.nextLine();
    }
    public void displayData(){
        System.out.println("Student ID: "+studentId);
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Age: "+age);
        System.out.println("Student Gender: "+gender);
        System.out.println("Student Address: "+address);
        System.out.println("Student Phone: "+phone);

    }
}
