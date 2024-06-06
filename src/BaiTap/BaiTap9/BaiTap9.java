package BaiTap.BaiTap9;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTap9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       ArrayList<Student> students= new ArrayList<>();
        do {
            System.out.println("**************Menu*****************");
            System.out.println("1.Hiện thị thông tin sách");
            System.out.println("2.Thêm mới học sinh");
            System.out.println("3.Sửa thông tin học sinh ");
            System.out.println("4.Xoá học sinh");
            System.out.println("0.Thoát");
            System.out.println("Mời chọn menu:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayAllStudent(students);
                    break;
                case 2:
                    addStudent(students);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:

                    System.out.println("Thoát thành công");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn 1-4 và 0");
                    break;
            }
        } while (true);
    }
    public static void displayAllStudent(ArrayList<Student> students){
        System.out.println("Danh sách học sinh");
        for (Student student: students){
            student.displayData();
        }
    }
    public static void addStudent(ArrayList<Student> students){
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        student.inputData(scanner);
        System.out.println("Đã thêm mới học sinh thành công.");
    }
    public static void updateStudent(ArrayList<Student> students){
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        System.out.print("Nhập mã học sinh cần sửa: ");

        student.setStudentId(scanner.nextLine());

    }

}
