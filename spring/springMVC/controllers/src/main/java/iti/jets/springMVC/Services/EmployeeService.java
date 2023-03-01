package iti.jets.springMVC.Services;


import iti.jets.springMVC.Repo.Entities.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employees = new ArrayList<>();



    public EmployeeService(){
        for(int i =0; i<100; i++){
            String x = "employee" + i;
            Employee e = new Employee(i , x, "IT");
            employees.add(e);
        }
    }


    public void addEmployee(Employee e){
        employees.add(e);
    }

    public Employee findEmployee(String name){
        for(int i = 0; i< employees.size(); i++){
            if (employees.get(i).getName().equals(name)) {
                return employees.get(i);
            }
        }
        return new Employee(0,"0","0");
    }

    public List<Employee> getAllEmployee(){
        return employees;
    }


}
