package ss14_thuat_toan_sap_xep;

import java.util.Arrays;

public class MinhHoaInsertionSort {
    public static void insertionSort(int[] arr) {
        int pos;
        int x;
        for (int j = 1; j < arr.length; j++) {
            pos = j;
            x = arr[pos]; // x la bien tam de lay ra 1 phan tu tai arr[j]
            while (0 < pos && x < arr[pos - 1]) {
                //so sanh x voi phan tu truoc no va hoan doi vi tri neu x thoa dieu kien
                System.out.println("lay x ra de so sanh voi tung phan tu truoc x: x = "+x);
                arr[pos] = arr[pos - 1];
                // neu thoa dieu kien thi doi vi tri arr[pos-1] ra phia sau
                System.out.println("doi vi tri "+arr[pos-1]+" ra phia sau va dua " + x +" len dau");
                arr[pos - 1] = x;
                // va gan x vao cho arr[j-1]
                pos--;
                // pos -- la de so sanh tung phan tu từ arr[pos] cho den dau mang
                System.out.println(Arrays.toString(arr));
                System.out.println("-------------------------");
            }
            arr[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 2, 7, 3, 9, 1};
        int[] arr2 = new int[]{1, 3, 7, 9, 15,28};
        System.out.println("Mang truoc khi sap xep: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Mang sau khi sap xep la: " + Arrays.toString(arr));
        System.out.println("++++++++++++");
        System.out.println("Doi voi mang da duoc sap xep: ");
        System.out.println("Mang truoc khi sort: "+Arrays.toString(arr2));
        insertionSort(arr2);
        System.out.println("Mang sau khi sort: " + Arrays.toString(arr2));
    }
}
