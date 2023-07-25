package kirill.helper;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CalculateHw2 {
    public int calculate(char op, int a, int b){
        int result = 0;
        try {
            switch (Character.toString(op)) {
                case ("+"):
                    return result = a + b;
                case ("-"):
                    result = a - b;
                    break;
                case ("*"):
                    result = a * b;
                    break;
                case ("/"):
                    result = a / b;
                    break;
                default:
                    throw new Exception("invalid operator");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        String path = "D:\\repositories\\YAP\\JAVA\\java_Hw\\log.txt";
        try{
            BufferedWriter br = new BufferedWriter(new FileWriter(path));
            String[] resultOutput = {
                    "User entered the first operand = ",
                    "User entered the operation = ",
                    "User entered the second operand = ",
                    "Result is "};

            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            int i = 0;
            while (i < resultOutput.length){
                String line;
                if(i == 0){
                    line = currentDateTime.format(formatter) +" "+resultOutput[i] + a + "\n";
                    br.write(line);
                } else if (i == 1) {
                    line = currentDateTime.format(formatter) +" "+resultOutput[i] + op + "\n";
                    br.write(line);
                }
                else if(i == 2){
                    line = currentDateTime.format(formatter) +" "+resultOutput[i] + b + "\n";
                    br.write(line);
                } else if (i == 3) {
                    line = currentDateTime.format(formatter) +" "+resultOutput[i] + result + "\n";
                    br.write(line);
                }
                br.flush();
                i++;
                }

        }catch (IOException e){
            System.out.println("invalid task 2");
        }
        return result;
    }
}
