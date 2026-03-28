package com.cg.repository;

import java.util.List;
import com.cg.dto.DepartmentWiseEmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cg.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

//    @Query("SELECT d.name, COUNT(e) FROM Department d LEFT JOIN d.employees e GROUP BY d.name")
//    List<Object[]> countEmployeesByDepartment();
	
	@Query("SELECT new com.cg.dto.DepartmentWiseEmployeeDTO(d.name, COUNT(e)) FROM Department d LEFT JOIN d.employees e GROUP BY d.name")
    List<DepartmentWiseEmployeeDTO> countEmployeesByDepartment();
}