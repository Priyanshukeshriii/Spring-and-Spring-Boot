package com.ParameterizedConstructor.services;

public class Employee {
    int emId;
    String name;
    String city;
    Double salayr;

    public Employee(String city, int emId, String name, Double salayr) {
        super();
        System.out.println("Employee object is created");
        this.city = city;
        this.emId = emId;
        this.name = name;
        this.salayr = salayr;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append(", emId=").append(emId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salayr=").append(salayr);
        sb.append("city='").append(city).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
