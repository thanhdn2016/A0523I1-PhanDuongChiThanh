package ss3_array_and_methood;

import java.util.Scanner;

public class ChenPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu trong mang: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Chi nhap " + (a - 1) + " phan tu!");
        int[] arr = new int[a];
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("Nhap phan tu tai index[" + i + "]: ");
            int b = Integer.parseInt(scanner.nextLine());
            arr[i] = b;
        }
        System.out.print("Nhap vao so ban muon chen vao mang: ");
        int soCanChen = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap vao vi tri index trong mang ban muon chen: ");
        int index = Integer.parseInt(scanner.nextLine());
        String str = "";
            if (arr[index] == 0) {
                arr[index] = soCanChen;
            } else {
                for (int i = arr.length - 1; i > index; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[index] = soCanChen;
            }
            for (int i = 0; i < arr.length; i++) {
                str += arr[i] + ", ";
            }
            System.out.println(str);
    }
}

