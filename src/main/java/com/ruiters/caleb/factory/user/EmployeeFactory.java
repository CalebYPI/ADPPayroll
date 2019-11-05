package com.ruiters.caleb.factory.user;

import com.ruiters.caleb.Misc;
import com.ruiters.caleb.domain.user.Employee;

public class EmployeeFactory {
    public static Employee getEmployee(String empFirstName, String empLastName, int empAge) {
        return new Employee.Builder()
                .EmployeeId(Misc.generateId())
                .EmployeeFirstName(empFirstName)
                .EmployeeLastName(empLastName)
                .build();
    }
}
