package com.singam.Controller;

import com.singam.Model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Jeyanthasingam on 7/8/2017.
 */
public interface EmployeeController {
    public Employee get(@PathVariable("empId") int id);
    public Employee put(@RequestBody Employee employee);
}
