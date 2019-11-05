package com.ruiters.caleb.service.user;

import com.ruiters.caleb.domain.demography.Gender;
import com.ruiters.caleb.domain.demography.Race;
import com.ruiters.caleb.domain.user.Employee;

public interface createEmployeeService {

    Employee saveEmployee(String empID, String empName, String empSurname, int empAge, String gender, String race);

    Gender getEmployeeGender(String id);

    Race getEmployeeRace(String id);
}
