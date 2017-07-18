package com.singam.Controller;

import com.singam.Controller.EmployeeController;
import com.singam.Model.Employee;
import com.singam.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.sax.SAXTransformerFactory;

/**
 * Created by Jeyanthasingam on 7/8/2017.
 */
@RestController
public class EmployeeControllerImp{
    @Autowired
    private EmployeeService employeeService;


    @RequestMapping(value="/Employees/{empId}", method= RequestMethod.GET)
    @CrossOrigin
    public Employee get(@PathVariable("empId") int id){
        System.out.println(id);

        return employeeService.get(id);
    }

    @RequestMapping(value="/Employees", method= RequestMethod.POST)
    @CrossOrigin
    public Employee put(@RequestBody Employee employee){
        System.out.println(employee.getName());
        System.out.println(employee.getAddress().getAdd1());
        return employeeService.put(employee);
    }

    @RequestMapping("/test")
    public String test(){
        return "test passed";
    }
}
