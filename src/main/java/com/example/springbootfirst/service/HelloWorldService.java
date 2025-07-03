package com.example.springbootfirst.service;

import com.example.springbootfirst.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class HelloWorldService {
    List<Employee> emp = new ArrayList<>(
            Arrays.asList(
                    new Employee(1, "Manobalan M", "Full-Stack Developer"),
                    new Employee(2, "ShriDarsh", "SpringBoot developer")
            )
    );


    public List<Employee> getEmpMethod() {
        return emp;
    }


    public List<Employee> postEmpMethod(){
        return emp;
    }


    public String putMethod(){
        return "This is put Method";
    }


    public void deleteEmpMethod(){
        System.out.println("All The Logs are Cleared!");
    }
}
