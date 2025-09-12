package com.revision;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorComparable {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<>();

        emps.add(new Employee("Annuvibha", "23232346", 01 ));
        emps.add(new Employee("Annu", "6698989898", 02 ));
        emps.add(new Employee("vibha", "9060604020", 03 ));



    }
}

class Employee implements Comparable<Employee>{
    private String Name;
    private String phone;
    private int id;

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
    }


    public Employee(String name, String phone, int id) {
        Name = name;
        this.phone = phone;
        this.id = id;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                '}';
    }


}