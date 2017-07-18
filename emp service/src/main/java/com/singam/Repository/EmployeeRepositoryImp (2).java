package com.singam.Repository;

import com.singam.Model.Address;
import com.singam.Model.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Jeyanthasingam on 7/8/2017.
 */

@Repository
public class EmployeeRepositoryImp implements EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Employee get(int id){
        return entityManager.find(Employee.class, id);

//        Address address= new Address("22","2nd lane",2756);
//        Employee employee = new Employee(id,"Saman","Galle","0773799701",address);
//        return employee;
    }

    @Override
    public Employee put(Employee employee) {
        entityManager.persist(employee);
        entityManager.flush();
        return employee;
    }


}
