package ss11_stack_queue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> wStack = new Stack<>();
        Stack<String> wStack2 = new Stack<>();
        System.out.println("Nhap vao mot chuoi");
        String string = scanner.nextLine();
        String[] mWord = string.split(" ");
        for (String w : mWord) {
            System.out.println(w);
            wStack.push(w);
        }
        System.out.println("chuoi ban vua nhap la: "+wStack);
        for (int i = 0; i < mWord.length; i++) {
            wStack2.push(wStack.pop());
        }
        System.out.println("Chuoi sau khi dao la: "+wStack2);
    }
}
