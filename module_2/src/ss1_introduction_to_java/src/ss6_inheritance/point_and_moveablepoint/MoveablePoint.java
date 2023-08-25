package ss6_inheritance.point_and_moveablepoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    float xSpeed, ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] speed = new float[2];
        speed[0] = getXSpeed();
        speed[1] = getYSpeed();
        System.out.println(Arrays.toString(speed));
        return speed;
    }

    @Override
    public String toString() {
        return "MoveablePoint {" +
                "xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                '}';
    }

    public void move() {
        x += xSpeed;
        y += ySpeed;
        xSpeed += 1.0;
        ySpeed += 1.0;
    }

    public static void main(String[] args) {
        MoveablePoint mvb = new MoveablePoint(10, 11);
        mvb.move();
        mvb.move();
        System.out.println(mvb.toString());
    }
}
