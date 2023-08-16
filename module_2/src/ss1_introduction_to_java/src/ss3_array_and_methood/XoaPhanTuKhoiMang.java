package ss3_array_and_methood;
import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        int a = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu tai index[" + i + "]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
            str += arr[i] + ", ";
        }
            System.out.println("Mang ban vua nhap la: " + str);
            System.out.println("Nhap vao phan tu ban muon xoa: ");
            int soCanXoa = Integer.parseInt(scanner.nextLine());
            String str2 = "";
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == soCanXoa) {
                    index = i;
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length - 1] = 0;
                }

                str2 += arr[i] + ", ";
            }
            System.out.println("So can xoa cua ban la: " + soCanXoa + "; nam tai vi tri index = " + index);
            System.out.println("Mang sau khi xoa la: " + str2);
    }
}
