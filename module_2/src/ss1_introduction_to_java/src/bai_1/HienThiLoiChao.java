package bai_1;
import java.util.Scanner;
public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Xin Chào " + name);
    }
}
