package kirill.programHwOOP.hw7.controller;

import kirill.programHwOOP.hw7.model.ComplexCalculate;
import kirill.programHwOOP.hw7.model.ComplexNumber;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ComplexController {
    public void start(){
        while (true) {
            System.out.println("1 - сложить\n2 - умножить\n3 - поделить");
            String move = getInput();

            System.out.println("Введите первое выражение");
            String firstComplex = getInput();

            System.out.println("Введите второе выражение");
            String secondComplex = getInput();

            if (valid(firstComplex) && valid(secondComplex)) {
                switch (move) { //TODO дописать case для 2 и 3
                    case "1": {
                        ComplexCalculate complexCalculate = new ComplexCalculate();
                        System.out.println(complexCalculate.addition(
                                makeComplex(firstComplex),
                                makeComplex(secondComplex)).toString());
                        break;
                    }
                    case "2": {
                        ComplexCalculate complexCalculate = new ComplexCalculate();
                        System.out.println(complexCalculate.multiply(
                                makeComplex(firstComplex),
                                makeComplex(secondComplex)));
                        break;
                    }
                    case "3": {
                        ComplexCalculate complexCalculate = new ComplexCalculate();
                        System.out.println(complexCalculate.divide(
                                makeComplex(firstComplex),
                                makeComplex(secondComplex)));
                        break;
                    }
                }

            } else {
                System.out.println("одно из выражений невалидно\nперепроверьте правильность введения!");
            }
            System.out.println("продолжить? y/n");
            if (!getInput().equals("y")) {
                return;
            }
        }
    }

    private ComplexNumber makeComplex(String input){ //3  -    2i
        input = input.trim().replace("\\s+", " ");//3 - 2i
        if(input.contains("i")){ //true
            List<String> complexParams = Arrays.asList(input.split(" "));
            char lookingForChar = '-';
            boolean charNotDuplicate = (input.indexOf(lookingForChar) == input.lastIndexOf(lookingForChar));

            if(input.contains(Character.toString(lookingForChar)) && charNotDuplicate) {
                if (input.startsWith(Character.toString(lookingForChar))) {
                    String realParam = complexParams.get(0);
                    String imaginaryParam = complexParams.get(2);
                    return new ComplexNumber(realParam, imaginaryParam);
                } else {
                    String realParam = complexParams.get(0);
                    String imaginaryParam = "-" + complexParams.get(2);
                    return new ComplexNumber(realParam, imaginaryParam);
                }
            } else if(!charNotDuplicate){
                String realParam = complexParams.get(0);
                String imaginaryParam = "-" + complexParams.get(2);
                return new ComplexNumber(realParam, imaginaryParam);
            } else {
                String realParam = complexParams.get(0);
                String imaginaryParam = complexParams.get(2);
                return new ComplexNumber(realParam, imaginaryParam);
            }
        }
        //TODO сделать класс простого калькулятора, либо вмешать в комплексный
        //TODO тут же проверить фабричный паттерн
//        }else{
            //здесь создавать простой калькулятор
//        }
        return null;
    }

    private String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private boolean valid(String expr){
        return expr.matches("^-?\\d+(\\.\\d+)?\\s[+-]\\s\\d+(\\.\\d+)?i$");
    }

}
