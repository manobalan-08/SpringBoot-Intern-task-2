package com.example.springbootfirst.controllers;

import com.example.springbootfirst.models.Employee;
import com.example.springbootfirst.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class HelloWorldController {


    @Autowired
    HelloWorldService hws;
    @GetMapping
    public List<Employee> getEmpMethod(){
        return hws.getEmpMethod();
    }

    @GetMapping("/{empID}")
    public Employee getEmployeeById(@PathVariable int empID)
    {
        return hws.getEmployeeById(empID);
    }
    @PostMapping
    public String postMethod(@RequestBody Employee employee){
     //   Employee employee= new Employee(5,"Akash","Solutions Architect");
        return hws.postMethod(employee);
    }

    @PutMapping("/{empID}")
    public String putMethod(@PathVariable int empID, @RequestBody Employee employee)
    {
        return hws.updateRecords(empID, employee);
    }



    @DeleteMapping("/{empID}")
    public String deleteEmployeeById(@PathVariable int empID){
        return hws.deleteEmployeeById(empID);
    }


   /* @DeleteMapping("/")
    public String deleteMethod(){
        return hws.deleteMethod();
    }


   @GetMapping("/employee")
    public List<Employee> getEmp(){
        return hws.getEmpMethod();
    }

   @PostMapping("/employee")
    public List<Employee> postEmp(){
        return hws.postEmpMethod();
    }*/



}
