package BaiTap.BaiTap8;

import java.util.Scanner;

public class BaiTap8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] emp = new Employee[2];
        for(int i=0;i<emp.length;i++){
            emp[i] = new Employee();
            emp[i].inputData(scanner);
        }
       for (Employee e : emp) {
           e.displayData();
       }

    }
}
