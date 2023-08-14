package ss3_array_and_methood;
import java.util.Arrays;
import java.util.Scanner;
public class TimMin {
    public static void main(String[] args) {
        int index=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử: ");
        int a = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[a];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a; i++) {
            System.out.print("Nhập vào phần tử thứ [" + i + "]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
            if (min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Phan tu nho nhat la:"+min+"\nNam tai vi tri index thu "+ index);
    }
}
