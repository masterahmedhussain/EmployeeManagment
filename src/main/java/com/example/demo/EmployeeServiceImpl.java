package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl  implements EmployeeService  {

    List<Employee> employees = new ArrayList<Employee>();

    @Override
    public String createEmployee(Employee employee) {
       employees.add(employee);
       return "saved";
    }

    @Override
    public List<Employee> readEmployees() {
        return employees;

    }
   

    @Override
    public boolean deleteEmployee(Long id) {
        if (employees.removeIf(employee -> employee.getId().equals(id))) {
            return true;
    
        } else {
            return false;
    
        }
        
    }

}
