package kirill.program;
import kirill.helper.CalculateHw2;
import kirill.helper.HelperHw1;
import kirill.helper.HelperHw2;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.nio.file.Path;

public class ProgramHw2 {
    public static void main(String[] args) {
//        int[] arr = new int[] {9, 4, 8, 3, 1,11,2,13,25,6};
//        HelperHw2 bubble = new HelperHw2();
//        bubble.sort(arr);
//
//        String path1 = "D:\\repositories\\YAP\\JAVA\\java_Hw\\file.txt";
//        try (BufferedReader br = new BufferedReader(new FileReader(path1))){
//            String line1;
//            while((line1 = br.readLine()) != null){
//                System.out.println(line1);
//            }
//
//        }catch (IOException e){
//            System.out.println("invalid file task 1");
//        }



        //log calculate
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 10;
            op = '/';
            b = 5;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        CalculateHw2 calculator = new CalculateHw2();
        int result = calculator.calculate(op, a, b);
//        System.out.println(result);

        String path2 = "D:\\repositories\\YAP\\JAVA\\java_Hw\\log.txt";
        try {
            BufferedReader br2 = new BufferedReader(new FileReader(path2));
            String line2;
            while((line2 = br2.readLine()) != null){
                System.out.println(line2);
            }
        }catch (IOException e){
            System.out.println("invalid file task2");
        }

    }
}
