package ss14_thuat_toan_sap_xep;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int x, pos;
        for (int i = 1; i < arr.length; i++) {
            pos = i;
            x = arr[pos];
            while (0 < pos && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                arr[pos - 1] = x;
                pos--;
            }
            arr[pos] = x;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang: ");
        int arrSize = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Nhap vao gia tri thu arr[" + i + "] : ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mang truoc khi duoc sort la: "+Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Mang sau khi duoc sort la: "+Arrays.toString(arr));
    }

}
