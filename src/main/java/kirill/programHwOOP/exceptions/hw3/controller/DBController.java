package kirill.programHwOOP.exceptions.hw3.controller;

import kirill.programHwOOP.exceptions.hw3.controller.exc.IncorrectBirthDateException;
import kirill.programHwOOP.exceptions.hw3.controller.exc.IncorrectFIOException;
import kirill.programHwOOP.exceptions.hw3.controller.exc.IncorrectGenderException;
import kirill.programHwOOP.exceptions.hw3.controller.exc.IncorrectPhoneNumberException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DBController {

    public void start()  {
            List<String> input = inputData();
            this.checkingAllInfo(input);
            FileUtil.writeToFile(input);
    }

    public List<String> inputData() {
        System.out.println("Введите латиницей следующую последовательность без запятых:" +
                "\nФамилию, Имя, Отчество, дату рождения(dd.mm.yyyy), номер телефона (11 цифр без +), пол(m/f)");
        return Arrays.asList(new Scanner(System.in)
                .nextLine()
                .replaceAll("\\s+", " ")
                .split(" "));
    }

    public List<String> checkingAllInfo(List<String> input) throws IncorrectFIOException,IncorrectPhoneNumberException,
            IncorrectGenderException,IncorrectBirthDateException {
        if(correctInputInfo(input) == 1){
            try {
                equalsFIO(input);
                correctBirthDate(input);
                correctPhoneNumber(input);
                correctGender(input);
                return input;
            }catch (IncorrectFIOException e){
                throw new IncorrectFIOException("Ошибка в ФИО: " + e.getMessage());
            }catch (IncorrectPhoneNumberException e){
                throw new IncorrectPhoneNumberException("формат номера телефона неверный: " + e.getMessage());
            }catch (IncorrectGenderException e){
                throw new IncorrectGenderException("гендер не m/f: " + e.getMessage());
            }catch (IncorrectBirthDateException e){
                throw new IncorrectBirthDateException("неверный формат даты " + e.getMessage());
            }
        }else{
            throw new IndexOutOfBoundsException("Введено "+input.size() +", необходимо 6");
        }
    }


    public int correctInputInfo(List<String> input) throws IndexOutOfBoundsException{
        if (input.size() != 6) {
            return -1;
        }
        return 1;
    }

    public void equalsFIO(List<String> input) throws IncorrectFIOException {
        for (int i = 0; i < 3; i++) {
            String elem = input.get(i);
            if (!elem.matches("[a-zA-Z]+")) {
                throw new IncorrectFIOException("Строка \"" + elem + "\" содержит недопустимые символы.");
            }
        }
    }

    public void correctPhoneNumber(List<String> input) throws IncorrectPhoneNumberException {
        if(!input.get(4).matches("[0-9]{11}")){
            throw new IncorrectPhoneNumberException("длинна меньше 11 или есть не только цифры");
        }
    }

    public void correctGender(List<String> input) throws IncorrectGenderException {
        if(!input.get(5).matches("[mf]") ){
            throw new IncorrectGenderException("Строка \"" + input.get(5)
                    + "\" содержит недопустимые символы (только m/f)");
        }
    }

    public void correctBirthDate(List<String> input) throws IncorrectBirthDateException {
        String InputDate = input.get(3);

        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate parseDate = LocalDate.parse(InputDate, formatter);

        if (parseDate.getDayOfMonth() < 1 || parseDate.getDayOfMonth() > 31 ||
                parseDate.getMonthValue() < 1 || parseDate.getMonthValue() > 12) {
            throw new IncorrectBirthDateException("дня или месяца не существует");
        }
        //TODO даты
        if ((currentDate.getYear() - parseDate.getYear() >= 80)
                || (currentDate.getYear() - parseDate.getYear() < 0)) {
            throw new IncorrectBirthDateException("не больше 80 лет или не позже текущей даты!");
        }
    }
}
