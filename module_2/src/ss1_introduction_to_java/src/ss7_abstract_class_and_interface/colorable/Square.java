package ss7_abstract_class_and_interface.colorable;

public class Square extends Shape implements IColorable {
    double a;

    public Square(double a) {
        this.a = a;
    }

    double area;

    public double getArea() {
        this.area = a * a;
        return area;
    }

    @Override
    public String toString() {
        return "Dien tich hinh vuong la: " + getArea() ;
    }
    @Override
    public void howToColor() {
        System.out.println("Square Color all four sides..");
    }
}
