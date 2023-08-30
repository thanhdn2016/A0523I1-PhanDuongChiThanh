package ss7_abstract_class_and_interface.resizeable;

public class Square extends Shape implements IResizeable {
    double a;
    public Square(double a) {
        this.a = a;
    }
     double area;
    public double getArea(){
        this.area = a*a;
        return area;
    }
    @Override
    public void resize(double percent) {
        this.a = (a + (percent * a / 100));
    }
    @Override
    public String toString() {
        return "Dien tich hinh vuong la: " + getArea();
    }
}
