package BaiTap.BaiTap8;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, boolean gen, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGen() {
        return gen;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void inputData(Scanner scanner){
        System.out.println("Mời nhập mã nhân viên:");
        employeeId=scanner.nextLine();
        System.out.println("Tên nhân viên:");
        employeeName=scanner.nextLine();
        System.out.println("Tuổi:");
        age=Integer.parseInt(scanner.nextLine());
        System.out.println("Giới tính:");
        gen=Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Hệ số lương:");
        rate=Double.parseDouble(scanner.nextLine());

    }
    public double calSalary(){
        return this.salary=this.rate*1300000;
    }
    public void displayData(){
        System.out.printf("\n Mã nhân viên: %s \n Tên nhân viên: %s \n Tuổi: %d \n Giới tính: %s \n Hệ số lương: %.1f \n Lương: %.1f",
                this.employeeId,
                this.employeeName,
                this.age,
                this.gen?"Nam":"Nữ",
                this.rate ,
                this.calSalary()
        );

    }

}
