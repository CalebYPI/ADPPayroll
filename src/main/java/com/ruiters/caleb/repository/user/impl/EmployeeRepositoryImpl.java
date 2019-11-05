package com.ruiters.caleb.repository.user.impl;

import com.ruiters.caleb.domain.user.Employee;
import com.ruiters.caleb.repository.user.EmployeeRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

import java.util.*;

@Repository("InMemory")
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Map<String, Employee> employees;

    private EmployeeRepositoryImpl() {
        this.employees = new HashMap<>();
    }

    private static EmployeeRepositoryImpl employeeRepositoryImpl = null;

    public static EmployeeRepositoryImpl getEmployeeRepositoryImpl() {
        if (employeeRepositoryImpl == null) {
            employeeRepositoryImpl = new EmployeeRepositoryImpl();
        }
        return employeeRepositoryImpl;
    }

    public Employee create(Employee employee){
        this.employees.put(employee.getEmpId(),employee);
        return employee;
    }

    public Employee read(String employeeId){
        return this.employees.get(employeeId);
    }

    public Employee update(Employee employee) {
        this.employees.replace(employee.getEmpId(),employee);
        return this.employees.get(employee.getEmpId());
    }

    public void delete(String employeeId) {
        this.employees.remove(employeeId);
    }

    public Set<Employee> getAll(){
        Collection<Employee> students = this.employees.values();
        Set<Employee> set = new HashSet<>();
        set.addAll(students);
        return set;
    }
}