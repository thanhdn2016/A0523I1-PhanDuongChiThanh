package ss10_list.arraylist;

import java.util.Scanner;

public class MyListTest {
    private static MyList<MyList> test = new MyList<>(10);

    static {
        test.add(0, "test");
        test.add(1, "test1");
        test.add(2, "test2");
        test.add(3, "test3");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chon chuc nang:");
            System.out.println("1.Display" +
                    "\n2.Add" +
                    "\n3.Delete" +
                    "\n4.Tim kiem"+
                    "\n5.Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println(test);
                    break;
                case 2:
                    System.out.print("Nhap vi tri index muon chen:");
                    int index = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhap noi dung:");
                    Object elements = scanner.nextLine();
                    test.add(index, elements);
                    System.out.println(test);
                    System.out.println("Da chen thanh cong");
                    break;
                case 3:
                    System.out.println("Nhap vi tri index muon xoa");
                    int deleteIndex = Integer.parseInt(scanner.nextLine());
                    test.remove(deleteIndex);
                    System.out.println(test);
                    System.out.println("Da xoa thanh cong");
                    break;
                case 4:
                    System.out.println("Nhap vao vi tri index ma ban muon lay ra");
                    int getIndex = Integer.parseInt(scanner.nextLine());
                    System.out.print("Phan tu ban muon lay la: ");
                    System.out.println(test.get(getIndex));
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
