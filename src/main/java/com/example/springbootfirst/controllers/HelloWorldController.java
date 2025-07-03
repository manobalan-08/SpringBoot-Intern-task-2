package com.example.springbootfirst.controllers;

import com.example.springbootfirst.models.Employee;
import com.example.springbootfirst.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController

public class HelloWorldController {


    @Autowired
    HelloWorldService hws;
   /* @GetMapping("/")
    public String hello(){
        return hws.helloWorld();
    }
    @PostMapping("/")
    public String postMethod(){
        return hws.postMethod();
    }

    @PutMapping("/")
    public String putMethod(){
        return hws.putMethod();
    }


    @DeleteMapping("/")
    public String deleteMethod(){
        return hws.deleteMethod();
    }
*/

    @GetMapping("/employee")
    public List<Employee> getEmp(){
        return hws.getEmpMethod();
    }

    @PostMapping("/employee")
    public List<Employee> postEmp(){
        return hws.postEmpMethod();
    }


}
