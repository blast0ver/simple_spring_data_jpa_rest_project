package com.romansholokh.spring.springboot.spring_data_jpa.controller;

import com.romansholokh.spring.springboot.spring_data_jpa.entity.Employee;
import com.romansholokh.spring.springboot.spring_data_jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController
{
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees()
    {
        List<Employee> allEmployees = employeeService.getAllEmployees();

        return allEmployees;
    }

    @GetMapping("employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId)
    {
        Employee employee = employeeService.getEmployeeById(employeeId);

        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee)
    {
        employeeService.saveEmployee(employee);

        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        employeeService.saveEmployee(employee);

        return employee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId)
    {
        Employee employee = employeeService.getEmployeeById(employeeId);

        employeeService.deleteEmployee(employeeId);

        return "Employee with id = " + employeeId + " was deleted";
    }

    @GetMapping("/employees/surname/{employeeSurname}")
    public List<Employee> getEmployeesBySurname(@PathVariable String employeeSurname)
    {
        List<Employee> employees = employeeService.getEmployeesBySurname(employeeSurname);

        return employees;
    }
}
