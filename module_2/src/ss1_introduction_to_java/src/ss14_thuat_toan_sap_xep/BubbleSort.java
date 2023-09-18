package ss14_thuat_toan_sap_xep;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int temp;
        boolean flag = true;
        for (int i = 0; i < arr.length && flag; i++) {
            flag = false;
            for (int j = arr.length - 1; i < j; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,5,3,8,4,9};
        int[] arr2 = new int[]{2,3,5,8,10};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------");
        System.out.println(Arrays.toString(arr2));
        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
