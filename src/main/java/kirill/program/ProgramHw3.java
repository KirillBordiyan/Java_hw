package kirill.program;
import kirill.helper.AnswerHw3;
import kirill.helper.MergeSortHw3;

import java.util.Arrays;

public class ProgramHw3 {
    public static void main(String[] args) {
        // task 1
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        AnswerHw3 ans = new AnswerHw3();
        ans.removeEvenNumbers(arr);

        //======================================
        //task 2
        Integer[] arr2 = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr2 = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr2 = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        AnswerHw3 ans2 = new AnswerHw3();
        ans.analyzeNumbers(arr2);
        //================================
        // task 3
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSortHw3 answer = new MergeSortHw3();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);

    }
}
