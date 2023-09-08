package ss11_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocMangSoNguyen {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap vao phan tu(index) thu [" + (i) + "] = ");
            stack.push(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println("Mang vua nhap la: " + stack);
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0; i < size; i++) {
            stack1.push(stack.pop());
        }
        System.out.println("Mang vua duoc dao nguoc la: " + stack1);
    }
}
