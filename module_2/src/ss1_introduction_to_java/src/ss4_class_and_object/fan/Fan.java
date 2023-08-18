package ss4_class_and_object.fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public boolean setOn() {
        return this.on = true;
    }
    public boolean setOff() {
        return this.on = false;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "Fan{" + "fan is on" +
                    ", speed = " + speed +
                    ", radius =" + radius +
                    ", color = '" + color + '\'' +
                    '}';
        } else {
            return "Fan{" + "fan is off" +
                    ", radius = " + radius +
                    ", color = '" + color + '\'' +
                    '}';
        }
    }
}
