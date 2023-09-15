package kirill.programHwOOP.hw5.view;

import kirill.programHwOOP.hw5.EmployeeApplication;
import kirill.programHwOOP.hw5.model.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {

    public void titleScreen(){
        System.out.println("1 - добавить сотрудника");
        System.out.println("2 - удалить сотрудника");
        System.out.println("================================");

        System.out.println("список сотрудников: ");
        for(int i = 0; i < EmployeeApplication.employeeService.getEntities().size(); i++){
            System.out.println(i + " -> " + EmployeeApplication.employeeService.getEntities().get(i).toString());
        }
    }

    public void removeEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("id сотрудника для удаления: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        Employee emplToRemove = EmployeeApplication.employeeService.getEntities().get(
                EmployeeApplication.employeeService.search4Entity(id));

        Employee boss = EmployeeApplication.employeeService.getEntities().get(
                EmployeeApplication.employeeService.search4Entity(emplToRemove.getReportsTo()));
        List<Integer> newUnit = new ArrayList<>();

        for(Employee employee: EmployeeApplication.employeeService.getEntities()){
            if(employee.getReportsTo() == emplToRemove.getId()){
                if(emplToRemove.getReportsTo() == emplToRemove.getId()){
                    employee.setReportsTo(employee.getId());
                }else {
                    employee.setReportsTo(boss.getId());
                }

            }
            employee.getUnit().remove(id);
        }

        EmployeeApplication.employeeService.removeEntity(id);

        for(Employee employee: EmployeeApplication.employeeService.getEntities()){
            if(employee.getReportsTo() == boss.getId()){
                newUnit.add(employee.getId());
            }
        }

        boss.setUnit(newUnit);

        titleScreen();
    }

    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Имя нового сотрудника: ");
        String name = scanner.nextLine();

        System.out.println("id номер сотрудника-босса: ");
        Integer reportTo = null;
        String inputRepTo = scanner.nextLine();
        reportTo = Integer.parseInt(inputRepTo);

        EmployeeApplication.employeeService.addEntity(name, reportTo, new ArrayList<>());

        Employee boss = EmployeeApplication.employeeService.getEntities().get(reportTo);
        List<Integer> subs = boss.getUnit();
        subs.add(EmployeeApplication.employeeService.getEntities().size()-1);
        boss.setUnit(subs);

        EmployeeApplication.employeeService.getEntities().set(reportTo, boss);

        titleScreen();
    }
}
