package com.cg.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "Name must not be empty") // it is a validation constraint that ensures the name field must not be empty.
    private String name;
    @Min(value = 15000, message = "Salary must be less than 150000") // it is a validation constraint that ensures the salary field must be a non-negative value.
    private double salary;

    @ElementCollection // it indicates that the mobileNumbers field is a collection of basic types (String in this case) that should be stored in a separate table.
    private Set<String> mobileNumbers;

    @ManyToOne // it indicates that many Employee entities can be associated with one Department entity.
    @JoinColumn(name = "dept_id") // it specifies the foreign key column in the Employee table that references the primary key of the Department table.
    @JsonBackReference  // it is used to avoid infinite recursion during JSON serialization when there is a bidirectional relationship between Employee and Department.
    private Department department;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Set<String> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(Set<String> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}