package ss10_list.arraylist;

import java.util.Scanner;

public class MyListTest {
    public static void main(String[] args) {
        MyList<MyList> test = new MyList<>(10);
        Scanner scanner = new Scanner(System.in);
        test.add(0,"test");
        test.add(1,"test1");
        test.add(2,"test2");
        test.add(3,"test3");
        System.out.println(test);
        System.out.print("Nhap vi tri index muon chen:");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap noi dung:");
        Object elements = scanner.nextLine();
        test.add(index,elements);
        System.out.println(test);
        System.out.println("Nhap vi tri index muon xoa");
        int deleteIndex = Integer.parseInt(scanner.nextLine());
        test.remove(deleteIndex);
        System.out.println(test);
        System.out.println(test.get(2));
    }
}
