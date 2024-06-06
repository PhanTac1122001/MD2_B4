package ThucHanh.ThucHanh1;

public class Rectangle {
    private double width;
    private double height;


    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getArea() {
        return this.width * this.height;
    }


    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public void display() {
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }
}
