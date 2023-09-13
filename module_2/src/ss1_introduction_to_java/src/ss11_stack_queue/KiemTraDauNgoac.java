package ss11_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    public static void main(String[] args) {
        Stack<Character> bStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao bieu thuc: ");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                bStack.push('(');
            } else if (str.charAt(i) == ')') {
                if (bStack.isEmpty()) {
                    System.out.println("???");
                    return;
                } else {
                    bStack.pop();
                }
            }
        }
        if (bStack.isEmpty()) {
            System.out.println("Well");
        } else {
            System.out.println("???");
        }
    }
}
