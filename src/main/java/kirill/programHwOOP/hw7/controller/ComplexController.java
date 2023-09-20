package kirill.programHwOOP.hw7.controller;

import kirill.programHwOOP.hw7.model.numbers.ComplexNumber;
import kirill.programHwOOP.hw7.model.numbers.DefaultNumbers;
import kirill.programHwOOP.hw7.model.numbers.RegularNumber;
import kirill.programHwOOP.hw7.model.service.CalculateInterface;
import kirill.programHwOOP.hw7.model.service.ComplexService;
import kirill.programHwOOP.hw7.model.service.RegularService;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Slf4j
public class ComplexController {
    public void start(){
        log.info("Калькулятор активирован");
        while (true) {
            System.out.println("Формат ввода комплексных чисел: a (+/-) bi");
            System.out.println("1 - сложить\n2 - умножить\n3 - поделить");
            String move = getInput();

            System.out.println("Введите первое выражение");
            String firstInput = getInput();

            System.out.println("Введите второе выражение");
            String secondInput = getInput();

            log.info("Входящие выражения:\n" + firstInput + "\n"+secondInput);
            if (validComplex(firstInput) && validComplex(secondInput)) {
                CalculateInterface complexService = new ComplexService();
                String result = "";
                switch (move) {
                    case "1": {
                        result = complexService.addition(
                                makeComplexIf(firstInput),
                                makeComplexIf(secondInput)).toString();
                        System.out.println(result);
                        log.info("Результат: " + result);
                        break;
                    }
                    case "2": {
                        result = complexService.multiply(
                                makeComplexIf(firstInput),
                                makeComplexIf(secondInput)).toString();
                        System.out.println(result);
                        log.info("Результат: " + result);
                        break;
                    }
                    case "3": {
                        result = complexService.divide(
                                makeComplexIf(firstInput),
                                makeComplexIf(secondInput)).toString();
                        System.out.println(result);
                        log.info("Результат: " + result);
                        break;
                    }
                    default:
                        break;
                }
                //TODO переписать if, сейчас проверку не сохраняет и комплексные проходят как к себе домой
            } else if(validRegular(firstInput.replaceAll("\\D",""))
                    && validRegular(secondInput.replaceAll("\\D",""))) {
                CalculateInterface regularService = new RegularService();
                String result = "";
                switch (move) {
                    case "1": {
                        result = regularService.addition(
                                makeComplexIf(firstInput),
                                makeComplexIf(secondInput)).toString();
                        System.out.println(result);
                        log.info("Результат: " + result);
                        break;
                    }
                    case "2": {
                        result = regularService.multiply(
                                makeComplexIf(firstInput),
                                makeComplexIf(secondInput)).toString();
                        System.out.println(result);
                        log.info("Результат: " + result);
                        break;
                    }
                    case "3": {
                        result = regularService.divide(
                                makeComplexIf(firstInput),
                                makeComplexIf(secondInput)).toString();
                        System.out.println(result);
                        log.info("Результат: " + result);
                        break;
                    }
                    default:
                        break;
                }
            }else {
                System.out.println("одно из выражений невалидно\nперепроверьте правильность введения!");
                log.error("ошибка во входящих выражениях/-нии");
            }
            System.out.println("продолжить? y/n");
            if (!getInput().equals("y")) {
                return;
            }
        }
    }

    private DefaultNumbers makeComplexIf(String input){
        input = input.trim().replace("\\s+", " ");
        if(input.contains("i")){
            return complexNumberOperations(input);
        } else {
            return regularNumberOperations(input);
        }
    }

    private String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private boolean validComplex(String expr){
        return expr.matches("^-?\\d+(\\.\\d+)?\\s[+-]\\s\\d+(\\.\\d+)?i$");
    }

    private boolean validRegular(String expr){
        return expr.matches("^-?\\d+(\\.\\d+)?");
    }

    private DefaultNumbers complexNumberOperations(String input){
        List<String> complexParams = Arrays.asList(input.split(" "));
        char lookingForChar = '-';
        boolean charNotDuplicate = (input.indexOf(lookingForChar) == input.lastIndexOf(lookingForChar));

        String realParam = complexParams.get(0);
        if(input.contains(Character.toString(lookingForChar)) && charNotDuplicate) {
            if (input.startsWith(Character.toString(lookingForChar))) {

                String imaginaryParam = complexParams.get(2);
                return new ComplexNumber(realParam, imaginaryParam);
            } else {
                String imaginaryParam = "-" + complexParams.get(2);
                return new ComplexNumber(realParam, imaginaryParam);
            }
        } else if(!charNotDuplicate){
            String imaginaryParam = "-" + complexParams.get(2);
            return new ComplexNumber(realParam, imaginaryParam);
        } else {
            String imaginaryParam = complexParams.get(2);
            return new ComplexNumber(realParam, imaginaryParam);
        }
    }

    private DefaultNumbers regularNumberOperations(String input){
        return new RegularNumber(input);
    }
}
