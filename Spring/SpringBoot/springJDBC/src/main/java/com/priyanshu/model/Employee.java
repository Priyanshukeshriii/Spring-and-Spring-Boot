package com.priyanshu.model;

public class Employee {
    private int Id;
    private String name;
    private String city;
    private Double salary;

    public String getCity(String city) {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee() {
        System.out.println("Employee non parameterized constructor called");
    }

    public Employee(String city, int id, String name, Double salary) {
        this.city = city;
        Id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Employee parameterized constructor called");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("city='").append(city).append('\'');
        sb.append(", Id=").append(Id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
