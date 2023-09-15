package kirill.programHwOOP.hw5;

import kirill.programHwOOP.hw5.controller.EmployeeController;
import kirill.programHwOOP.hw5.model.service.EmployeeService;

import java.util.ArrayList;

public class EmployeeApplication {
    public static EmployeeService employeeService = new EmployeeService();


    public static void main(String[] args) {
        employeeService.addEntity("CEO", 0, new ArrayList<>());

        EmployeeController ec = new EmployeeController();
        ec.employeeScanner();
    }
}
