package com.singam.Repository;

import com.singam.Model.Employee;

/**
 * Created by Jeyanthasingam on 7/8/2017.
 */
public interface EmployeeRepository {
    public Employee get(int id);

    public Employee put(Employee employee);
}
