package ss16_io_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String PATH_FILE = "/Users/thanh/Desktop/codegym/A0523I1-PhanDuongChiThanh/module_2/src/ss1_introduction_to_java/src/ss16_io_text_file/country.csv";
    public static void main(String[] args) {
        File file = new File(PATH_FILE);
        List<Country> list = new ArrayList<>();
        String[] array = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null){
                array = line.split(",");
                list.add(new Country(Integer.parseInt(array[0]),array[1],array[2]));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Country c:list) {
            System.out.println(c);
        }
    }
}
