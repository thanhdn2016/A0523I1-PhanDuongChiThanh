package ss5_access_modifier_and_static_method;

public class Circle {
    private double radius = 1.0;
    private String color ="red";
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
    }
}
