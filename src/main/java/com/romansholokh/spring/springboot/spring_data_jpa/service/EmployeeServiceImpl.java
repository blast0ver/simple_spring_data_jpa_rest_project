package com.romansholokh.spring.springboot.spring_data_jpa.service;

import com.romansholokh.spring.springboot.spring_data_jpa.dao.EmployeeRepository;
import com.romansholokh.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee)
    {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(int employeeId)
    {
        Employee employee = null;
        Optional<Employee> optional = employeeRepository.findById(employeeId);
        if (optional.isPresent())
        {
            employee = optional.get();
        }

        return employee;
    }

    @Override
    public void deleteEmployee(int employeeId)
    {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public List<Employee> getEmployeesBySurname(String employeeSurname)
    {
        return employeeRepository.findAllByEmployeeSurname(employeeSurname);
    }
}
