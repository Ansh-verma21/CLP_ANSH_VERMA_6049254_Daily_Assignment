package com.cg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cg.dto.DepartmentWiseEmployeeDTO;
import com.cg.entity.Department;
import com.cg.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping("/count")
    public List<DepartmentWiseEmployeeDTO> getEmployeeCount() {
        return service.countEmployeesByDept();
    }
    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department dept) {
        return service.addDepartment(dept);
    }
}