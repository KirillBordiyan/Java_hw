package kirill.programHwOOP.hw5.model.service;

import kirill.programHwOOP.hw5.EmployeeApplication;
import kirill.programHwOOP.hw5.model.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements EntityService {

    private List<Employee> employeeList = new ArrayList<>();
    private int id = 0;
    @Override
    public void addEntity(String name, int reportsTo, List<Integer> units) {
        employeeList.add(new Employee(id, name, reportsTo, units));
        id++;
    }

    @Override
    public void removeEntity(int id) {
        employeeList.remove(search4Entity(id));
    }

    @Override
    public List<Employee> getEntities() {
        return employeeList;
    }

    public int search4Entity(int id){
        for(int i = 0; i<EmployeeApplication.employeeService.getEntities().size(); i++){
            if(EmployeeApplication.employeeService.getEntities().get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}
