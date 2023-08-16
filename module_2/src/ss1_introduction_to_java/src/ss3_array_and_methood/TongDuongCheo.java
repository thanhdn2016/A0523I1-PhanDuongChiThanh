package ss3_array_and_methood;

import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int col;
        int row;
        do {
            System.out.print("Nhập vào số cột(col) của ma trận (arr[row][col]): ");
            col = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập vào số hàng(row) của ma trận (arr[row][col]) : ");
            row = Integer.parseInt(scanner.nextLine());
            if (row != col){
                System.out.println("Nhap vao 2 so bang nhau");
                System.out.println("------------------------------");
            }
        } while (row != col);
        Float[][] arr = new Float[row][col];
        String str = "";
        for (int i = 0; i < row; i++) {
            str += "[";
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập vào phần tử thứ [" + i + "]" + "[" + j + "]" + ": ");
                arr[i][j] = Float.parseFloat(scanner.nextLine());
                str += arr[i][j] + ", ";
            }
            str += "], \n";
            System.out.println("-------------------------------");
        }
        System.out.println("Mang hai chieu ban vua nhap la:\n" + str);
        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < row; i++) {
            sum += arr[i][i];
        }
        for (int i = 0; i < row; i++) {
            sum2 += arr[i][row-1-i];
        }
        System.out.println("tong cua duong cheo tu trai sang phai la: "+sum);
        System.out.println("Tong cua duong cheo tu phai sang trai la: "+sum2);
    }
}

