package ss3_array_and_methood;
import java.time.temporal.ValueRange;
import java.util.Arrays;
import java.util.Scanner;
public class TimMaxMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cột(col) của ma trận (arr[row][col]): ");
        int col = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số hàng(row) của ma trận (arr[row][col]) : ");
        int row = Integer.parseInt(scanner.nextLine());
        Float[][] arr = new Float[row][col];
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập vào phần tử thứ [" + i + "]" + "["+ j +"]"+": ");
                arr[i][j] = Float.parseFloat(scanner.nextLine());
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
            System.out.println("-------------------------------");
        }
        System.out.println("Mảng hai chiều bạn vừa nhập là"+ Arrays.deepToString(arr));
        System.out.println("Phần tử lớn nhất là: " + formatNumber(max));
    }
    public static String formatNumber(double num) {
        if (num == (int) num) {
            return String.valueOf((int) num);
        } else {
            return String.valueOf(num);
        }
    }
}
