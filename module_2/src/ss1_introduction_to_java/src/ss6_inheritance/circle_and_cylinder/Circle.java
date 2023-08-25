package ss6_inheritance.circle_and_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
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
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [Ban Kinh = " + radius + ", Mau Sac = " + color + "]";
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        System.out.println(circle1.toString());
        System.out.println("Dien tich hinh tron la: " + circle1.getArea());

        Circle circle2 = new Circle(3.0, "blue");
        System.out.println(circle2.toString());
        System.out.println("Dien tich hinh tron la : " + circle2.getArea());
    }
}

