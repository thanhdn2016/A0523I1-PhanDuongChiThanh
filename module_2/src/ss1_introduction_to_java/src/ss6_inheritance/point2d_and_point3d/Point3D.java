package ss6_inheritance.point2d_and_point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz = new float[3];
        xyz[0] = getX();
        xyz[1] = getY();
        xyz[2] = getZ();
        System.out.println(Arrays.toString(xyz));
        return xyz;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D {" +
                "x = " + x +
                ", y = " + y +
                ", z = " + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D test3D = new Point3D(2, 3, 4);
        test3D.setXYZ(1, 2, 3);
        test3D.getXYZ();
        System.out.println(test3D.toString());
    }
}
