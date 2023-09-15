package kirill.programHwOOP.hw5.controller;

import kirill.programHwOOP.hw5.view.EmployeeView;

import java.util.Scanner;

public class EmployeeController {
    EmployeeView employeeView = new EmployeeView();
    public void employeeScanner(){
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        employeeView.titleScreen();

        while(!inputStr.equals("q")){
            inputStr = scanner.nextLine();
            switch (inputStr){
                case "1" :
                    employeeView.addEmployee();
                    break;
                case "2" :
                    employeeView.removeEmployee();
                    break;
                default:
                    break;
            }
        }
    }
}
