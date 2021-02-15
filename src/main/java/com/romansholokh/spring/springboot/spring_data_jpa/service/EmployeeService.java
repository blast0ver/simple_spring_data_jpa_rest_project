package com.romansholokh.spring.springboot.spring_data_jpa.service;

import com.romansholokh.spring.springboot.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService
{
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(int employeeId);

    public void deleteEmployee(int employeeId);

    public List<Employee> getEmployeesBySurname(String employeeSurname);
}
