package ss2_loop;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong so nguyen to < 100 can in ra: ");
        int a = Integer.parseInt(scanner.nextLine());
        int N = 0;
        int count = 0;
        while (count < a){
            boolean flag = true;
            if (N>2){
                if (N < 100) {
                    for (int i = 2; i < N; i++) {
                        if (N % i == 0) {
                            flag = false;
                        }
                    }
                } else {
                    flag = false;
                    a = count;
                    System.out.println("Chi co "+ (count) +" so nguyen to nho hon 100");
                }
                if (flag){
                    System.out.println((count+1)+": "+N);
                    count++;
                }
            }
            N++;
        }
    }
    }

