package kirill.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AnswerHw3 {

    public static void removeEvenNumbers(Integer[] arr) {
//        Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел,
//        удаляла бы из него четные числа и выводила список без четных чисел.
//        Напишите свой код в методе removeEvenNumbers класса Answer.
//        Метод removeEvenNumbers принимает на вход один параметр:
//        Integer[] arr - список целых чисел

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i : arr) {
            if (i % 2 != 0) {
                nums.add(i);
            }
        }
        System.out.println(nums);
    }
//        Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:
//        Сортирует его по возрастанию и выводит на экран
//        Находит минимальное значение в списке и выводит на экран - Minimum is {число}
//        Находит максимальное значение в списке и выводит на экран - Maximum is {число}
//        Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
//        Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
//        Integer[] arr - список целых чисел


        public static void analyzeNumbers(Integer[] arr){
        Arrays.sort(arr);

        int sum=0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(Arrays.asList(arr));
        System.out.println("Minimum is " + arr[0]);
        System.out.println("Maximum is " + arr[arr.length-1]);
        System.out.println("Average is = " + sum/arr.length);

        }
}
