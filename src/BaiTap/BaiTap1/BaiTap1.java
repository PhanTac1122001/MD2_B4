package BaiTap.BaiTap1;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner scanner= new Scanner(System.in);
        circle.inputData(scanner);
        circle.displayData();
        circle.chuVi();
        circle.dienTich();


    }
}
