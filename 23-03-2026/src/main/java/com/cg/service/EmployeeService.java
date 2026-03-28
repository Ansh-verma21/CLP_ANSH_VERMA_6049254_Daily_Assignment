package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.entity.Employee;
import com.cg.repository.IEmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepository repo;

    public Employee insertEmployee(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAllEmployeesWithDept() {
        return repo.getAllEmployeesWithDept();
    }

    public List<Object[]> getEmployeesByDeptName(String deptName) {
        return repo.findByDepartmentName(deptName);
    }

    public List<Employee> getEmployeeByMobile(String mobile) {
		return repo.findByMobileNumber(mobile);
	}
}