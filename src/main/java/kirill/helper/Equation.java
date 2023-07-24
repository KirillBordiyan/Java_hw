package kirill.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Equation {

    public static String getSolution(String path) {
        try {
            ClassLoader classLoader = Equation.class.getClassLoader();
            File file = new File(classLoader.getResource(path).getFile());
            var inputStream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String condition = br.readLine();

            List<String> elements = Arrays.asList(condition.split(" "));//[]
            System.out.println("Given the equation: " + condition);
            int resultSize = elements.get(4).length(); //2
            int result = Integer.parseInt(elements.get(4)); //69
            String res1 = "";
            String res2 = "";
            boolean resultChanged = false;

            for (int i = 0; i < resultSize; i++) {
                int currentDigit = (result / (int) Math.pow(10, i)) % 10;
                String digit1 = new StringBuilder(elements.get(0)).reverse().toString().substring(i, i + 1);
                String digit2 = new StringBuilder(elements.get(2)).reverse().toString().substring(i, i + 1);

                if (digit1.equals("?") && digit2.equals("?")) {
                    res1 = String.valueOf(currentDigit) + res1;
                    res2 = "0" + res2;
                } else if (!digit1.equals("?") && digit2.equals("?")) {
                    if (resultChanged) {
                        currentDigit -= 1;
                    }
                    res1 = digit1 + res1;
                    res2 = (currentDigit + 10 - Integer.parseInt(digit1)) % 10 + res2;
                    if (Integer.parseInt(digit1) > currentDigit) {
                        resultChanged = true;
                    }

                } else if (digit1.equals("?") && !digit2.equals("?")) {
                    if (resultChanged) {
                        currentDigit -= 1;
                    }
                    res2 = digit2 + res2;
                    res1 = (currentDigit + 10 - Integer.parseInt(digit2)) % 10 + res1;
                    if (Integer.parseInt(digit2) > currentDigit) {
                        resultChanged = true;
                    }
                } else {
                    res1 = digit1 + res1;
                    res2 = digit2 + res2;
                }
            }
            return "Result: " + res1 + " + " + res2 + " = " + elements.get(4);
        } catch (Exception e) {
             return "incorrect";
        }
    }
}
