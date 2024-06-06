package BaiTap.BaiTap4;

public class Fan {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean onFan;
    private double radius;
    private String color;

    public Fan() {
    }

    public Fan(int speed, boolean onFan, double radius, String color) {
        this.speed = speed;
        this.onFan = onFan;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOnFan() {
        return onFan;
    }

    public void setOnFan(boolean onFan) {
        this.onFan = onFan;
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
    @Override
    public String toString(){
        if(this.onFan){
            return "fan is on, speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius;
        }
        else {
            return "fan is off, color: " + this.color + ", radius: " + this.radius;
        }
    }
}
