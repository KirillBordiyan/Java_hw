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

    //task 1 hw2
    public void sort(int[] mas) {
        String path = "D:\\repositories\\YAP\\JAVA\\java_Hw\\file.txt";
        try (BufferedWriter br = new BufferedWriter(new FileWriter(path))) {
            boolean flag = false;
            while (!flag) {
                flag = true;
                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] > mas[i + 1]) {
                        flag = false;
                        int bubble = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = bubble;
                    }
                }
                String line = currentDateTime.format(formatter) + " " + Arrays.toString(mas);
                br.write(line);
                br.write("\n");
                br.flush();
            }
        } catch (IOException e) {
            System.out.println("invalid file");
        }
    }

//    Реализовать метод, принимающий 2 символа c1 и c2 и четное число n, который возвращает строку,
//    состоящую из символов c1c2 длины n.
//    Пример: (c1 = 'a', c2 = 'b', n = 6 => "ababab")

    public String task5Hw2(char sumbol1, char sumbol2, int n) {
        String result = "";
        if (n % 2 == 0) {
                int i = 1;
                while (i <= n/2) {
                    result += sumbol1;
                    result += sumbol2;
                    i++;
                }

        }
        return result;
    }
    public boolean palindrom(String arg){
        boolean isPal = true;
        char[] subArgs = arg.toCharArray();
        for(int i = 0; i < arg.length(); i++){
            if(subArgs[i] == subArgs[arg.length()-1-i]){
                continue;
            }else{
                return isPal = false;
            }
        }

        return isPal;
    }
}

