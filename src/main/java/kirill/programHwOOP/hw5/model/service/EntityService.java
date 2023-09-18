package kirill.programHwOOP.hw5.model.service;

import kirill.programHwOOP.hw5.model.entity.Employee;

import java.util.List;

public interface EntityService{

    void addEntity(String name, int reportsTo, List<Integer> units);
    void removeEntity(int id);
    List<Employee> getEntities();
}