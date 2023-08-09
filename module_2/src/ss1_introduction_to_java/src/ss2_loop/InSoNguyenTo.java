package ss2_loop;

import java.util.Scanner;

public class InSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong so nguyen to can in ra: ");
        int a = Integer.parseInt(scanner.nextLine());
        int N = 0;
        int count = 0;
        while (count < a){
            boolean flag = true;
            if (N>2){
                for (int i = 2; i < N; i++){
                    if (N%i==0){
                        flag = false;
                    }
                }
                if (flag){
                    System.out.println(N);
                    count++;
                }
            }
            N++;
        }
    }
}
