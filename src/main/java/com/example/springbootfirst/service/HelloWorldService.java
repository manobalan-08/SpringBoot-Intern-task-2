package com.example.springbootfirst.service;

import com.example.springbootfirst.models.Employee;
import org.springframework.stereotype.Service;

import javax.lang.model.element.Element;
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
    public Employee getEmployeeById(int empID) {
        for (Employee e : emp) {
            if (e.getEmpID() == empID) {
                System.out.println("EMPID: " + e.getEmpID() + " " + e);
                return e;  // Return the employee if found
            }
        }
        // If not found, return an empty/default Employee
        return new Employee();
    }

    public String deleteEmployeeById(int empID) {

        for (int I = 0; I < emp.size(); I++) {

            if (empID == emp.get(I).getEmpID()) {

                emp.remove(I);

                return "Employee with ID " + empID + " deleted successfully.";

            }

        }

        return "Employee with ID " + empID + " not found.";

    }

    public String updateRecords(int empid, Employee employee) {
        for (int i = 0; i < emp.size(); i++) {
            Employee current = emp.get(i);
            if (current.getEmpID() == empid) {
                current.setName(employee.getName());
                current.setJob(employee.getJob());
                return "Employee with ID " + empid + " updated successfully.";
            }
        }
        return "Employee with ID " + empid + " not found.";
    }
   /* public List<Employee> postEmpMethod(){
        return emp;
    }*/


   /* public List<Employee> postMethod(){
        return emp;
    }*/

    public String putMethod(){
        return "This is put Method";
    }


    public void deleteEmpMethod(){
        System.out.println("All The Logs are Cleared!");
    }

    public String postMethod(Employee employee) {
        emp.add(employee);
        return "Added a Student";
    }

    public String deleteMethod(){
        return"This is Delete Method";
    }


}
