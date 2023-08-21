package ss5_access_modifier_and_static_method;

import java.util.Scanner;

public class Circle {
    public double radius = 1.0;
    public String color ="red";
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ban kinh(r): ");
        double r = scanner.nextDouble();
        Circle circle = new Circle(r);
        System.out.println("Dien tich hinh tron la: "+circle.getArea());
        System.out.println("Ban kinh(r) hinh tron la: "+circle.getRadius());
    }
}
