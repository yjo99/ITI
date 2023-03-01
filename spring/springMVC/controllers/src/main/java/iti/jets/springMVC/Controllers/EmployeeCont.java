package iti.jets.springMVC.Controllers;

import iti.jets.springMVC.Repo.Entities.Employee;
import iti.jets.springMVC.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeCont {
    @Autowired
    private EmployeeService empServ;

    public EmployeeCont(){

    }



    @GetMapping(value = "/addemp")
    public List<Employee> addEmployee(){

        return empServ.getAllEmployee();
    }

    @GetMapping("/allemps")
    public List<Employee> getEmployees(){
        return empServ.getAllEmployee();
    }

    @GetMapping("/empbyname/{name}")
    public Employee getEmployee(@PathVariable String name){
        return empServ.findEmployee(name);
    }
}
