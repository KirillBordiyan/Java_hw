package kirill.programHwJava;
import kirill.helper.CalculateHw2;
import kirill.helper.HelperHw2;

import java.io.*;

public class ProgramHw2 {
    public static void main(String[] args) {
        // task 1 sort suc
//        int[] arr = new int[] {9, 4, 8, 3, 1};
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



        //task 2 log calculate
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 15;
            op = '*';
            b = 5;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        CalculateHw2 calculator = new CalculateHw2();
        int result = calculator.calculate(op, a, b);

        String path2 = "log.txt";
        try {
            BufferedReader br2 = new BufferedReader(new FileReader(path2));
            String line2;
            while((line2 = br2.readLine()) != null){
                System.out.println(line2);
            }
        }catch (IOException e){
            System.out.println("invalid file task2");
        }




        //SQL task 3 suc
//        String QUERY = "";
//        String PARAMS = "";
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            QUERY = "select * from students where ";
//            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
//        }
//        else{
//            QUERY = args[0];
//            PARAMS = args[1];
//        }
//
//        AnswerHw2 ans = new AnswerHw2();
//        System.out.println(ans.answer(QUERY, PARAMS));

        //JSON task 4 suc
//        String JSON = "";
//        String ELEMENT1 = "";
//        String ELEMENT2 = "";
//        String ELEMENT3 = "";
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},"+
//                    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
//                    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
//            ELEMENT1 = "Студент ";
//            ELEMENT2 = " получил ";
//            ELEMENT3 = " по предмету ";
//        }
//        else{
//            JSON = args[0];
//            ELEMENT1 = args[1];
//            ELEMENT2 = args[2];
//            ELEMENT3 = args[3];
//        }
//
//        AnswerHw2 ans = new AnswerHw2();
//        ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
//    }
//    private static void clearLogFile() {
//        String path2 = "log.txt";
//        File logFile = new File(path2);
//        if (logFile.exists()) {
//            try {
//                FileWriter fileWriter = new FileWriter(logFile, false);
//                fileWriter.write("");
//                fileWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    //task 5 =======================
    HelperHw2 objTask = new HelperHw2();
    System.out.println(objTask.task5Hw2('a','b',6));

    HelperHw2 palindrom = new HelperHw2();
    String word = "шалаш";
    System.out.println(palindrom.palindrom(word));


    }
}
