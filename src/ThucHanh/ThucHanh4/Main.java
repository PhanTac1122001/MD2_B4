package ThucHanh.ThucHanh4;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 5);


        System.out.println(calc.add());
        System.out.println(calc.subtract());
        System.out.println(calc.multiply());
        System.out.println(calc.divide());

        calc.setA(20);
        calc.setB(0);
        System.out.println(calc.divide());
    }
}
