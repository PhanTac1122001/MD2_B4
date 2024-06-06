package BaiTap.BaiTap2;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner sc = new Scanner(System.in);
        quadraticEquation.inputData(sc);
        double discriminant = quadraticEquation.getDiscriminant();
        if (discriminant >= 0) {
            System.out.println("Phương trình có hai nghiệm thực phân biệt:");
            System.out.println("Root 1: " + quadraticEquation.getRoot1());
            System.out.println("Root 2: " + quadraticEquation.getRoot2());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
