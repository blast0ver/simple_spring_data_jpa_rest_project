package com.romansholokh.spring.springboot.spring_data_jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int employeeId;

    @Column(name = "name")
    private String employeeName;

    @Column(name = "surname")
    private String employeeSurname;

    @Column(name = "department")
    private String employeeDepartment;

    @Column(name = "salary")
    private int employeeSalary;

    public Employee()
    {
    }

    public Employee(String employeeName,
                    String employeeSurname,
                    String employeeDepartment,
                    int employeeSalary)
    {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurname()
    {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname)
    {
        this.employeeSurname = employeeSurname;
    }

    public String getEmployeeDepartment()
    {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment)
    {
        this.employeeDepartment = employeeDepartment;
    }

    public int getEmployeeSalary()
    {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary)
    {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "Id=" + employeeId +
                ", Name='" + employeeName + '\'' +
                ", Surname='" + employeeSurname + '\'' +
                ", Department='" + employeeDepartment + '\'' +
                ", Salary=" + employeeSalary +
                '}';
    }
}
