package kirill.programHwJava;

import kirill.helper.CalculatorHw4;
import kirill.helper.MyQueueHw4;
import kirill.helper.LLTasksHw4;

import java.util.LinkedList;

public class ProgramHw4 {
    public static void main(String[] args) {
        //=============== task 1 =========
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        System.out.println(ll);

        LLTasksHw4 answer = new LLTasksHw4();
        System.out.println(answer.revert(ll));
        //================================================


        //=============== task 2 =========
        MyQueueHw4<Integer> queue = new MyQueueHw4<>();

        if (args.length == 0) {
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());

        //================================================


        //=============== task 3 =========
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 35;
            op = '*';
            b = 7;
            c = 67;
            op2 = '-';
            d = 15;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        LinkedList<Integer> ans = new LinkedList<>();
        CalculatorHw4 calculator = new CalculatorHw4();
        int result = calculator.calculate(op, a, b, ans);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d, ans);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0, ans);
        System.out.println(prevResult);
    }
}
