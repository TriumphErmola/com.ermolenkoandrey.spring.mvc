package com.ermolenkoandrey.spring.mvc;


import jakarta.validation.constraints.*;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "Минимум 2 знака")
    private String name;
    @NotBlank(message = "Это обязательное поле")
    private String surName;
    @Min(value = 500, message = "Не меньше 499")
    @Max(value = 1000, message = "Не больше 1001")
    private int salary;
    private String department;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> departments;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}",message = "Плиз юзай шаблон номера ХХХ-ХХ-ХХ")
    private String empNumber;


    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resourses");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW-520M");
        carBrands.put("Audi", "Audi-A8");
        carBrands.put("Porche", "Panamera");

    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
