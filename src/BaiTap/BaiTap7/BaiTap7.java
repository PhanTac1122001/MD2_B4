package BaiTap.BaiTap7;

import java.util.Scanner;

public class BaiTap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle=new Circle();
        circle.inputData(sc);
        System.out.println("Chu vi hình tròn: "+circle.getPerimeter());
        System.out.println("Diện tích hình tròn: "+circle.getArea());
    }
}
