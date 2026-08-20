package com.priyanshu.dao;

import com.priyanshu.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class EmployeeDaoImp implements IEmployeeDao{
    @Autowired
    private DataSource dataSource;
    private String sql_query = "select * from employee";
    List<Employee> employees = null;

    @Override
    public List<Employee> getEmployeeInfo(){
        System.out.println("DataSource impl is "+dataSource.getClass().getName());
        try{
            Connection connection = dataSource.getConnection();
            System.out.println("Connection impl is "+connection.getClass().getName());
            PreparedStatement preparedStatement = connection.prepareStatement(sql_query);
            ResultSet rs =  preparedStatement.executeQuery();
            employees = new ArrayList<>();
            while (rs.next()){
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setCity(rs.getString("city"));
                emp.setSalary(rs.getDouble("salary"));
                employees.add(emp);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return employees;
    }

}
