package com.codecool.jpaexample.model;

import javax.persistence.*;


@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String country;
    @Column(length = 4)
    private String Zip;
    private String city;
    private String addr;
    @OneToOne(mappedBy = "address")
    private Student student;

    public Address() {
    }

    public Address(String country, String Zip, String city, String addr) {
        this.country = country;
        this.Zip = Zip;
        this.city = city;
        this.addr = addr;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zipcode) {
        this.Zip = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", zipcode='" + Zip + '\'' +
                ", city='" + city + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
