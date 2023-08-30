package ss7_abstract_class_and_interface.resizeable;

public class Main {
    public static void main(String[] args) {
        IResizeable[] shapes = new IResizeable[3];
        shapes[0] = new Circle(5);
        System.out.println(shapes[0]);
        shapes[0].resize(50);
        System.out.println("Sau khi tang len 50% thi {" + shapes[0]+"}");
        shapes[1] = new Rectangle(4, 10);
        System.out.println(shapes[1]);
        shapes[1].resize(50);
        System.out.println("Sau khi tang len 50% thi {" + shapes[1]+"}");
        shapes[2] = new Square(4);
        System.out.println(shapes[2]);
        shapes[2].resize(50);
        System.out.println("Sau khi tang len 50% thi {" + shapes[2]+"}");

    }
}

