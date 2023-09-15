package ss13_thuat_toan_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang");
        int arrSize = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Nhap vao gia tri tai arr[" + i + "]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        BinarySearch bs = new BinarySearch();
        boolean flag = true;
        do {
            System.out.println("Nhap vao so can tim");
            int soCanTim = Integer.parseInt(scanner.nextLine());
            if (bs.binarySearch(arr, 0, arrSize - 1, soCanTim) == -1) {
                System.out.println("So can tim: " + soCanTim + " khong ton tai trong mang");
            } else {
                System.out.println("So can tim nam tai vi tri: " + bs.binarySearch(arr, 0, arrSize - 1, soCanTim));
                flag = false;
            }
        } while (flag);
    }
}
