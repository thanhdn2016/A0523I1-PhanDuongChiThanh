package ss6_inheritance;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder [Ban Kinh = " + getRadius() + ", Mau sac = " + getColor() + ", Chieu Cao = " + height + "]";
    }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(3.0, 5.0);
        System.out.println(cylinder1.toString());
        System.out.println("The Tich la: " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(2.0, 4.0, "green");
        System.out.println(cylinder2.toString());
        System.out.println("The Tich la: " + cylinder2.getVolume());
    }
}

