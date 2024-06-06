package BaiTap.BaiTap1;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void chuVi(){
        System.out.println("Chu vi hình tròn là:"+ radius*2*Math.PI);



    }
    public void dienTich(){
        System.out.println("Diện tích hình tròn là:"+ (Math.pow(radius,2))*Math.PI);

    }
    public void inputData(Scanner scanner){
        System.out.println("Mời bạn nhập bán kính");
        radius =Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập màu");
        color = scanner.nextLine();

    }
    public void displayData(){
        System.out.printf("Bán kính là: %.2f \n Màu là: %s\n", this.radius, this.color);
    }
}
