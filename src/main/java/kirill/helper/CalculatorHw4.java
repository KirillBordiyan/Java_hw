package kirill.helper;

import java.util.LinkedList;

public class CalculatorHw4 {
    public int calculate(char op, int a, int b, LinkedList<Integer> ans) {
        int result = 0;
        try {
            if ("+".equals(Character.toString(op))) {
                result = a + b;
                ans.add(result);
            } else if ("-".equals(Character.toString(op))) {
                result = a - b;
                ans.add(result);
            } else if ("*".equals(Character.toString(op))) {
                result = a * b;
                ans.add(result);
            } else if ("/".equals(Character.toString(op))) {
                result = a / b;
                ans.add(result);
            } else if ("<".equals(Character.toString(op))) {
                result = ans.get(ans.size() - 2);
            } else {
                System.out.println("invalid operation");
            }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return result;
    }
}

