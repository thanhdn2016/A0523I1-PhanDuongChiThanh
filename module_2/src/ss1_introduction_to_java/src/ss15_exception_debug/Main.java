package ss15_exception_debug;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Nhap vao 3 canh cua tam giac: ");
        do {
            flag = false;

            try {
                System.out.print("canh a: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.print("canh b: ");
                b = Integer.parseInt(scanner.nextLine());
                System.out.print("canh c: ");
                c = Integer.parseInt(scanner.nextLine());
                checkNum(a, b, c);
                System.out.println("a,b,c la 3 canh cua tam giac");
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("vui long nhap lai a,b,c");
                flag = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("vui long nhap lai dung cu phap");
                flag = true;
            }
        } while (flag);
    }

    public static boolean checkNum(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("cac canh cua tam giac khong the nho hon 0");
        } else if ((a + b < c || a + c < b || b + c < a)) {
            throw new IllegalTriangleException("tong 2 canh bat ki cua tam giac phai lon hon canh con lai");
        }
        return true;
    }

}
