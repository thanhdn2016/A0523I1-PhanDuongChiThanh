package ss7_abstract_class_and_interface.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(4);
        shapes[1] = new Circle(5);
        shapes[2] = new Rectangle(10, 4);
        shapes[0].howToColor();
        shapes[1].howToColor();
        shapes[2].howToColor();
        System.out.println(shapes[0]);
        System.out.println(shapes[1]);
        System.out.println(shapes[2]);
    }
}
