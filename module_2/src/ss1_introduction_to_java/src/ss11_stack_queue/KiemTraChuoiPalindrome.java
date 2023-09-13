package ss11_stack_queue;

import java.util.*;

public class KiemTraChuoiPalindrome {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        System.out.println("Nhap vao chuoi can kiem tra: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            queue.offer(str.charAt(i));
        }
        boolean flag = true;
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                flag = false;
                break;
            }
        }
        if (!flag){
            System.out.println("'" + str + "' " + "Khong phai la chuoi Palindrome");
        }
        if (flag){
            System.out.println("'" + str + "' " + "La chuoi Palindrome");
        }
    }
}
