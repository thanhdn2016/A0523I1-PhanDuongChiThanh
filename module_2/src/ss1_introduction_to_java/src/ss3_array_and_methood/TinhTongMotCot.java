package ss3_array_and_methood;
import java.util.Arrays;
import java.util.Scanner;
public class TinhTongMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cột(col) của ma trận (arr[row][col]): ");
        int col = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số hàng(row) của ma trận (arr[row][col]) : ");
        int row = Integer.parseInt(scanner.nextLine());
        Float[][] arr = new Float[row][col];
        String str = "";
        double max = 0;
        for (int i = 0; i < row; i++) {
            str += "[";
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập vào phần tử thứ [" + i + "]" + "[" + j + "]" + ": ");
                arr[i][j] = Float.parseFloat(scanner.nextLine());
                str +=  arr[i][j]+", ";
            }
            str += "], \n";
            System.out.println("-------------------------------");
        }
        System.out.println("Mang hai chieu ban vua nhap la:\n"+str);
        System.out.println("Nhap vao so thu tu (tinh tu 0) cot ma ban muon tinh tong: ");
        int sumCols = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (sumCols == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tong la: "+formatNumber(sum));
    }
    public static String formatNumber(double num) {
        if (num == (int) num) {
            return String.valueOf((int) num);
        } else {
            return String.valueOf(num);
        }
    }
}
