package com.singam.Model;



import javax.persistence.*;


/**
 * Created by Jeyanthasingam on 7/8/2017.
 */



@Entity
@Table(name = "users")
public class Employee {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

/*    public Employee(int id, String name, String city, String mobile) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.mobile = mobile;
//        this.address = address;
    }*/



    @Column(name="city")
    private String city;

    @Column(name="mobile")
    private String mobile;


    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
