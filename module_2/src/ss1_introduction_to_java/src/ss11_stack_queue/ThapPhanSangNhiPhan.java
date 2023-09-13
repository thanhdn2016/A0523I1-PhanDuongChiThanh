package ss11_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhiPhan {
    public static void main(String[] args) {
        int binary, count = 0;
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int decimal;

        do {
            System.out.print("Nhap vao so can chuyen doi (so nguyen duong) sang he nhi phan: ");
            decimal = Integer.parseInt(scanner.nextLine());
        } while (decimal <= 0);
        do {
            binary = decimal % 2;
            stack.push(binary);
            decimal = decimal / 2;
            count++;
        } while (decimal > 0);
        System.out.println("stack = " + stack);
        System.out.println("Stack size = " + stack.size());
        for (int i = 0; i < count; i++) {
            System.out.println(stack.pop());
        }
    }
}
