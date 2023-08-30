package ss7_abstract_class_and_interface.resizeable;

public class Rectangle extends Shape implements IResizeable {
    private double width = 1.0;
    private double length = 1.0;
    private double area;
    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        area =  width * this.length;
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }
    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public void resize(double percent) {
        this.width = width + (width * percent / 100);
        this.length = length +(length*percent/100);
    }

    @Override
    public String toString() {
        return "Dien tich hinh chu nhat la: " + getArea();
    }
}