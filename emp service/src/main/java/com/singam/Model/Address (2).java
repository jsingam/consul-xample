package com.singam.Model;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Jeyanthasingam on 7/8/2017.
 */
@Entity
@Table(name = "address")
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    @Column(name="add1")
    private String add1;

    @Column(name="add2")
    private String add2;

    @Column(name="zip")
    private int zipcode;

//    @OneToOne
//    @JoinColumn
//    private Employee employee;

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

  /*  public Address(String add1, String add2, int zipcode) {
        this.add1 = add1;
        this.add2 = add2;
        this.zipcode = zipcode;
    }*/

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }


}
