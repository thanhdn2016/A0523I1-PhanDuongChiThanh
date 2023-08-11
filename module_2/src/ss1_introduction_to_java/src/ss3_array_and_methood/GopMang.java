package ss3_array_and_methood;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strA ="";
        String strB ="";
        String strC ="";
        System.out.print("Nhap vao do dai mang A: ");
        int a = Integer.parseInt(scanner.nextLine());
        int[] arrA = new int[a];
        for (int i = 0; i < arrA.length; i++) {
            System.out.print("Nhap phan tu tai index[" + i + "]: ");
            int aValue = Integer.parseInt(scanner.nextLine());
            arrA[i] = aValue;
            strA += arrA[i] + ", ";
        }
        System.out.println("Mang A ban vua nhap la: "+Arrays.toString(arrA));
        System.out.print("Nhap vao do dai mang B: ");
        int b = Integer.parseInt(scanner.nextLine());
        int[] arrB = new int[b];
        for (int j = 0; j < arrB.length; j++) {
            System.out.print("Nhap phan tu tai index[" + j + "]: ");
            int bValue = Integer.parseInt(scanner.nextLine());
            arrB[j] = bValue;
            strB += arrB[j] + ", ";
        }
        System.out.println("Mang B ban vua nhap la: "+Arrays.toString(arrB));
        int[] arrC = new int[a+b];
        for (int i = 0; i < arrA.length; i++) {
            arrC[i] = arrA[i];
        }
        for (int j = 0; j < arrB.length; j++) {
            arrC[arrA.length+j] = arrB[j];
        }
        //cach 1
        System.out.println("cach 1");
        System.out.println("sau khi gop 2 mang la: "+Arrays.toString(arrC));
        //cach 2
        System.out.println("cach 2");
        strC = strA+strB;
        System.out.println("sau khi gop 2 mang la: "+strC);
    }
}
