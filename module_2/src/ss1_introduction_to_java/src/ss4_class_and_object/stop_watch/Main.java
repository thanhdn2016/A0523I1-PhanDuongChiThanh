package ss4_class_and_object.stop_watch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        StopWatch sw = new StopWatch();
        do {
            System.out.println("-----Menu-----");
            System.out.println("1.start");
            System.out.println("2.stop");
            System.out.println("3.thoat");
            a = scanner.nextInt();

            switch (a) {
                case 1:
                    sw.start();
                    break;
                case 2:
                    sw.stop();
                    double time = sw.getElapsedTime();
                    System.out.println("stop watch da dung");
                    System.out.println("Thoi gian da troi qua la: "+sw.getElapsedTime() + " milisecond");
                    break;
                case 3:
                    System.out.println("Thoat stop watch");
                    break;
                case 4:
                    System.out.println("vui long nhap tu 1-3");
            }
        }while (a!=3);
    }
}
