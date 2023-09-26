package kirill.programHwOOP.exceptions.hw2;

import java.util.Scanner;

public class Task4Hw2 {
    public static void main(String[] args) {
        getString();
    }

//    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void getString(){
        System.out.println("введите любую информацию: ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().matches("^\\s*$")){
            System.out.println("пустые строки нельзя");
        }
    }
}
