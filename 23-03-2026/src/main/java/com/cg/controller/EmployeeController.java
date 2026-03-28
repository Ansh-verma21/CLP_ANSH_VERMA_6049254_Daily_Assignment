package com.cg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cg.entity.Employee;
import com.cg.exception.EmployeeNotFoundException;
import com.cg.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/add")
    public Employee addEmployee(@Valid @RequestBody Employee emp) { // @valid is used to trigger the validation constraints defined in the Employee entity class. It ensures that the incoming Employee object adheres to the specified validation rules before being processed by the service layer.
         return service.insertEmployee(emp);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return service.getAllEmployeesWithDept();
    }

    @GetMapping("/dept/{name}")
    public List<Object[]> getByDept(@PathVariable String name) {
        return service.getEmployeesByDeptName(name);
    }

    @GetMapping("/mobile/{num}")
    public List<Employee> getByMobile(@PathVariable String num) {
    	List<Employee> res = service.getEmployeeByMobile(num);
    	if (res == null || res.isEmpty()) {
			throw new EmployeeNotFoundException("Employee with phone number " + num + " not found");
		}

		return res;
	}
//	@ExceptionHandler(EmployeeNotFoundException.class)
//  public ResponseEntity<String> handlerForPhoneNotFound(EmployeeNotFoundException ex) {
//
//      return ResponseEntity
//              .status(HttpStatus.NOT_FOUND)
//              .body(ex.getMessage());
//  }
}