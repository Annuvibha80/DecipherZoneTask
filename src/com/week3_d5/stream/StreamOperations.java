package com.week3_d5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Employee{
    private int id;
    private String name;
    private  String city;
    private  int age;
    private String gender;
    private  String department;
    private int yearOfJoining;
    private  double salary;

    public Employee(int id, String name, String city, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }
}


public class StreamOperations {
    public static List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee(01, "Annuvibha", "Jaipur", 22, "female", "Development", 2024, 100));
        employeeList.add(new Employee(02, "Kajal", "Pune", 22, "female", "Development", 2024, 120));
        employeeList.add(new Employee(03, "Golu", "Banglore", 24, "female", "Development", 2024, 180));
        employeeList.add(new Employee(04, "Chotu", "Jaipur", 26, "female", "Development", 2024, 200));
        return employeeList;
    }


    public static void main(String[] args) {
        List<Employee> employees = employeeList();

        //Requirement : get all employee name as list

//        //using normal method as we use
        List<String> empNames = new ArrayList<>();
        for(Employee emp : employees){
            empNames.add(emp.getName());
        }
        System.out.println(empNames);



        //stream pipeline
       List<String> allEmployeeNames = employees.stream()
               .map(emp -> emp.getName())
               .toList();
        System.out.println(allEmployeeNames);

        //filter()
        //Employee Name, age<24
        //create String obj : we can't use stream obj second time

        List<String> empNames2 =  employees.stream()
                .filter(emp-> emp.getAge()<24)   //Intermediate Operation
                .map(emp -> emp.getName())         //Intermediate Operation
                .toList();      //terminal operation      //Terminal Operation

        System.out.println(empNames2 );

        //Print all city names of employees
       // List<String> CityNames we removed this because for each only wors on void , not with any data return type
                employees.stream()
                 .map(emp -> emp.getCity())
                 .distinct()
                 .forEach(System.out::println);

        //Get count od employees whose salary is >100
        long countOfEmployee = employees.stream()
                .filter(emp -> emp.getSalary()>100)
                .count();
        System.out.println(countOfEmployee);

        //Get 3 first employee object as list
        List<Employee> first3Employee = employees.stream()
                .limit(2)
                .toList();
        System.out.println(first3Employee);

        //Skip
    }
}