package com.singam.Service;

import com.singam.Model.Employee;

/**
 * Created by Jeyanthasingam on 7/8/2017.
 */
public interface EmployeeService {
    public Employee get(int id);
    public Employee put(Employee employee);
}
