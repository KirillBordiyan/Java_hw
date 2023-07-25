package kirill.helper;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelperHw2 {
    private static File log;
    private static FileWriter fileWriter;

    public void sort(int[] mas) {
        String path = "D:\\repositories\\YAP\\JAVA\\java_Hw\\file.txt";
        try (BufferedWriter br = new BufferedWriter(new FileWriter(path))) {
            boolean flag = false;
            while (!flag) {
                flag = true;
                for (int i = 0; i < mas.length-1 ; i++) {
                        LocalDateTime currentDateTime = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                        if (mas[i] > mas[i + 1]) {
                            flag = false;
                            int bubble = mas[i];
                            mas[i] = mas[i + 1];
                            mas[i + 1] = bubble;
                            String line = currentDateTime.format(formatter) +" "+ Arrays.toString(mas);
                            br.write(line);
                            br.write("\n");
                            br.flush();
                        }
                }
            }
        } catch (IOException e) {
            System.out.println("invalid file");
        }
    }
}
