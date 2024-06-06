package ThucHanh.ThucHanh4;

public class Calculator {
    private double a;
    private double b;

    public Calculator() {
        this.a = 0;
        this.b = 0;
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double add() {
        return this.a + this.b;
    }

    public double subtract() {
        return this.a - this.b;
    }

    public double multiply() {
        return this.a * this.b;
    }

    public double divide() {
        if (this.b == 0) {
            return Double.NaN; // Trả về NaN khi chia cho 0
        } else {
            return this.a / this.b;
        }
    }
}
