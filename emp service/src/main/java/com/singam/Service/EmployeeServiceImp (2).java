package com.singam.Service;

import com.singam.Model.Employee;
import com.singam.Repository.EmployeeRepository;
import com.singam.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.ServiceMode;

/**
 * Created by Jeyanthasingam on 7/8/2017.
 */

@Service
@Transactional
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee get(int id){
        return employeeRepository.get(id);
    }

    @Override
    public Employee put(Employee employee) {
        return employeeRepository.put(employee);
    }
}
