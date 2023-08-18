package ss4_class_and_object.phuong_trinh_bac_hai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao a: ");
        a = scanner.nextDouble();
        System.out.print("Nhap vao b: ");
        b = scanner.nextDouble();
        System.out.print("Nhap vao c: ");
        c = scanner.nextDouble();
        QuadraticEquation pt1 = new QuadraticEquation(a, b, c);
        if (pt1.getDelta() == 0) {
            System.out.println("Phuong trinh co nghiem kep la: " + pt1.x1());
        } else if (pt1.getDelta() > 0) {
            System.out.println("Phuong trinh co hai nghiem phan biet la: ");
            System.out.print("x1: " + pt1.x1());
            System.out.print("     x2: " + pt1.x2());
        } else {
            System.out.println("Phuong Trinh vo nghiem!");
        }
    }
}
