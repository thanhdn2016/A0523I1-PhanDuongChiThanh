package ss7_abstract_class_and_interface.colorable;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    @Override
    public void howToColor() {
        System.out.println("Circle Color all four sides..");
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "ban kinh hinh tron la: "
                + getRadius();
    }
}