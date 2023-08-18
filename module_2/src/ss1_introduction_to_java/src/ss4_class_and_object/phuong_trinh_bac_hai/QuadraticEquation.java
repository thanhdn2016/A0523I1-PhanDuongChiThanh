package ss4_class_and_object.phuong_trinh_bac_hai;

public class QuadraticEquation {
    private double a, b, c, delta, x1, x2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        return delta = (b * b) - (4 * a * c);
    }

    public double x1() {
        return x1 = (((-1) * b) + (Math.sqrt(delta))) / (2 * a);
    }

    public double x2() {
        return x2 = (((-1) * b) - (Math.sqrt(delta))) / (2 * a);
    }
}
