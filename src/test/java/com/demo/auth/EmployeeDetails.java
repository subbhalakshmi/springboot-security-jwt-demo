package com.demo.auth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {

    private int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

}
public class EmployeeDetails {


    public static void main(String args[]){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1,"raju", "Finance"));
        employeeList.add(new Employee(2,"abi", "Finance"));
        employeeList.add(new Employee(3,"pavi", "Tech"));
        employeeList.add(new Employee(4,"mohan", "Marketing"));
        employeeList.add(new Employee(5,"dinu", "Finance"));
        employeeList.add(new Employee(6,"san", "Tech"));

        System.out.println("Before Sort ");
        for(Employee e : employeeList){
            System.out.println(e.toString());

        }

//        anynomus implementation
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int comparision = 0;
                comparision = o1.getDesignation().compareTo(o2.getDesignation());
                if(comparision==0){
                    comparision = o1.getName().compareTo(o2.getName());
                }
                return comparision;
            }
        });

        System.out.println("After Sort ");
        for(Employee e : employeeList){
            System.out.println(e.toString());

        }
    }
}
