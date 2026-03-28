package com.cg.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String managerName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL) // it indicates that one Department entity can be associated with many Employee entities, and the mappedBy attribute specifies that the relationship is managed by the "department" field in the Employee entity. The cascade attribute ensures that any operations performed on the Department entity will also be applied to its associated Employee entities.
    @JsonManagedReference // it is used to manage the forward part of the reference during JSON serialization, allowing the Department entity to include its associated Employee entities without causing infinite recursion.
    private List<Employee> employees;

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

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}