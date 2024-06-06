package BaiTap.BaiTap7;

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
    public double getArea() {
        return (Math.pow(radius,2)*Math.PI);
    }
    public double getPerimeter() {
        return radius*2*Math.PI;
    }
    public void inputData(Scanner sc) {
        System.out.print("Enter radius: ");
        radius=Double.parseDouble(sc.nextLine());
        System.out.print("Enter color: ");
        color=sc.nextLine();
    }

}
