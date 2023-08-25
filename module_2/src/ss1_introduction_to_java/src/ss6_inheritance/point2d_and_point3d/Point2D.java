package ss6_inheritance.point2d_and_point3d;

import java.util.Arrays;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = getX();
        arr[1] = getY();
        System.out.println(Arrays.toString(arr));
        return arr;

    }

    @Override
    public String toString() {
        return "Point2D {" +
                "x = " + x +
                ", y = " + y +
                '}';
    }

    public static void main(String[] args) {
        Point2D test = new Point2D(2, 3);
        test.setXY(1, 2);
        test.getXY();
        System.out.println(test.toString());
    }
}
