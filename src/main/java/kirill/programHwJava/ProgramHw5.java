package kirill.program;

import java.util.*;

public class ProgramHw5 { //для удобства все будет в этом классе
    public static void main(String[] args) {
        String text = "Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB. " +
                "Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.";

        printStats(text); //реализовано без повторений значений
    }

/**
 * Дан текст. Нужно отсортировать слова по длине (по возрастанию) и вывести статистику на экран.
 * Регистр слова не имеет значения. Формат вывода произвольный.
 * Программа-минимум:
 * 1. Слова, состоящие из дефисов, считаем одним словом. Т.е. каких-то - одно слово из 8 символов.
 * 2. Точки и запятые не должны входить в статистику.
 *
 * Доп. задание:
 * 1. * Не включать дефис в длину слова. Т.е. каких-то - одно слово из 7 символов.
 **/

    static void printStats(String text){
        String[] formatText =  text
                .replace(".", "")
                .replace(",","")
                .toLowerCase()
                .split(" ");
        Map<Integer, List<String>> mapping = new TreeMap<>();

        for (String item : formatText) {

            char[] charWordText = item.toCharArray();
            int wordSize = charWordText.length;

            for(Character currentChar: charWordText) {
                if ('-' == currentChar) {
                    wordSize -= 1;
                }
            }

            if (mapping.containsKey(wordSize)) {
                if (!mapping.get(wordSize).contains(item) ) {
                    List<String> oldVal = mapping.get(wordSize);
                    oldVal.add(item);
                    mapping.put(wordSize, oldVal);
                }//если есть, то в else{continue;}
            }else{
                List<String> newVal = new ArrayList<>();
                newVal.add(item);
                mapping.put(wordSize, newVal);
            }
        }
        System.out.println(mapping);
    }
}
