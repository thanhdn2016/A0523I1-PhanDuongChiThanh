package ss3_array_and_methood;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        String str = "";
        String kyTu = "";
        char c;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 1 chuoi: ");
        str = scanner.nextLine();
        do {
            System.out.print("Nhap vao 1 ky tu ban muon dem so lan xuat hien trong chuoi: ");
            kyTu = scanner.nextLine();
            if (kyTu.length()!=1) {
                System.out.println("chi nhap vao 1 ky tu!");
            }
        }
        while (kyTu.length() != 1);
        c = kyTu.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==c){
                count++;
            }
        }
        System.out.println("Tong so lan xuat hien cua ky tu "+c+" la: "+count);
    }
}
