package ss11_stack_queue;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemTuTrongChuoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> stringMap = new TreeMap<>();
        int count = 0;
        System.out.println("Nhap vao 1 chuoi: ");
        String str = scanner.nextLine();
         str = str.toLowerCase();
        System.out.println(str);
        for (String w : str.split("\\s", 0)) {
            if (stringMap.containsKey(w)) {
                count = stringMap.get(w);
                stringMap.put(w, count + 1);
            } else {
                stringMap.put(w, 1);
            }
        }
        System.out.println(stringMap);
    }
}
