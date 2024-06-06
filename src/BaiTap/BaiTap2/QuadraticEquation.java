package BaiTap.BaiTap2;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {

       return b*b - 4*a*c;
    }
    public double getRoot1(){
        double discriminant= getDiscriminant();
        if(discriminant<0){
            return 0;
        }
         else {
            return (-b+Math.sqrt(discriminant))/(2*a);
        }
    }

    public double getRoot2(){
        double discriminant= getDiscriminant();
        if(discriminant<0){
            return 0;
        }else {
            return (-b-Math.sqrt(discriminant))/(2*a);
        }
    }
    public void inputData(Scanner sc){
        System.out.println("Mời nhập a:");
        a=Double.parseDouble(sc.nextLine());
        System.out.println("Mời nhập b:");
        b=Double.parseDouble(sc.nextLine());
        System.out.println("Mời nhập c:");
        c=Double.parseDouble(sc.nextLine());
    }

}
