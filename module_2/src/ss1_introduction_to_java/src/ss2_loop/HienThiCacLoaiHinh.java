package ss2_loop;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("--------- Menu ---------");
            System.out.println("1: In hinh chu nhat");
            System.out.println("2: In hinh tam giac vuong, canh o bottom-left");
            System.out.println("3: In hinh tam giac vuong, canh o top-left");
            System.out.println("4: Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.print("Nhap vao chieu dai: ");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhap vao chieu rong: ");
                    int b = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < b; i++){
                        System.out.print("*");
                        for (int j = 1; j < a; j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                case 2:
                    System.out.println("Nhap vao chieu cao: ");
            }
        }
    }
}
