package bai_3;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        double rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao USD: ");
         double usd = Float.parseFloat(scanner.nextLine());
         double quyDoi = usd * rate;
        System.out.println("Gia tri da quy doi tu USD sang VND la: "+quyDoi+" VND");
    }
}
