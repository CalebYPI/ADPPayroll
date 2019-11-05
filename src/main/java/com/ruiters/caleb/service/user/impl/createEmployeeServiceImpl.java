package com.ruiters.caleb.service.user.impl;

import com.ruiters.caleb.Misc;
import com.ruiters.caleb.domain.demography.Gender;
import com.ruiters.caleb.domain.demography.Race;
import com.ruiters.caleb.domain.user.Employee;
import com.ruiters.caleb.factory.demography.GenderFactory;
import com.ruiters.caleb.factory.demography.RaceFactory;
import com.ruiters.caleb.factory.user.EmployeeFactory;
import com.ruiters.caleb.repository.demography.impl.GenderRepositoryImpl;
import com.ruiters.caleb.repository.demography.impl.RaceRepositoryImpl;
import com.ruiters.caleb.repository.user.impl.EmployeeRepositoryImpl;
import com.ruiters.caleb.service.user.createEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class createEmployeeServiceImpl implements createEmployeeService {

    @Autowired
    public
    EmployeeRepositoryImpl empRepository = EmployeeRepositoryImpl.getEmployeeRepositoryImpl();
    @Autowired
    public
    GenderRepositoryImpl genderRepository = GenderRepositoryImpl.getGenderRepositoryImpl();
    @Autowired
    public
    RaceRepositoryImpl raceRepository = RaceRepositoryImpl.getRaceRepositoryImpl();
    @Autowired
    EmployeeFactory employeeFactory;
    @Autowired
    GenderFactory genderFactory;
    @Autowired
    RaceFactory raceFactory;

    public createEmployeeServiceImpl(){}

    @Override
    public Employee saveEmployee(String empID, String empName, String empSurname, int empAge, String empGender, String empRace) {
        Employee employee = this.empRepository.create(EmployeeFactory.getEmployee(empName,empSurname,empAge));
        Gender gender = this.genderRepository.create(GenderFactory.getGender(empGender));
        Race race = this.raceRepository.create(RaceFactory.buildRace(empRace));
        return employee;
    }



    @Override
    public Gender getEmployeeGender(String gender){
        return this.genderRepository.read(gender);
    }

    @Override
    public Race getEmployeeRace(String race){
        return this.raceRepository.read(race);
    }


}
