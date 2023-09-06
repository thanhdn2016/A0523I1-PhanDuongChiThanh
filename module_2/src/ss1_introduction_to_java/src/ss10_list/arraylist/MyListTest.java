package ss10_list.arraylist;

import java.util.Scanner;

public class MyListTest {
    public static void main(String[] args) {
        MyList<MyList> test = new MyList<>(10);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap index muon chen:");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap elements:");
        Object elements = scanner.nextLine();
        test.add(index,elements);
        System.out.println(test);

    }
}
