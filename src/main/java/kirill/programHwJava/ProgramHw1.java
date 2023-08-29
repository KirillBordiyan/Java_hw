package kirill.program;
import kirill.helper.EquationHw1;
import kirill.helper.HelperHw1;


public class ProgramHw1 {
    public static void main(String[] args) {

        int n = 0;
        //читается, что вводили
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 4;
        } else {
            n = Integer.parseInt(args[0]);
        }
        HelperHw1 ans = new HelperHw1();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);


        HelperHw1 task2 = new HelperHw1();
        task2.PrintNums();


        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 10;
            op = '/';
            b = 0;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        HelperHw1 calculator = new HelperHw1();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);

//==========================================================
        String file = "";

        if (args.length == 0) {
            file = "input.txt";
        } else {
            file = args[0];
        }


//        String resultTask4 = getSolution(file);
//        System.out.println(result);

        EquationHw1 eq = new EquationHw1();
        String resultTask4 = eq.getSolution(file);
        System.out.println(resultTask4);
    }


//    В файле задано уравнение вида q + w = e (q, w, e >= 0).
//    Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//    Восстановите выражение до верного равенства.
//    Предложите хотя бы одно решение или сообщите, что его нет.
//    Напишите класс Equation, содержащий метод getSolution, который будет считывать уравнение из файла
//    и восстановит его до верного равенства.
//    Выведите сначала строку формата "Given the equation: {выражение из файла}".
//    А затем верните строку формата "Result: {цельное выражение}".
//    Если выражение не имеет решений - верните строку "No solution".
//    public static String getSolution(String str) {
//
//    }
}

