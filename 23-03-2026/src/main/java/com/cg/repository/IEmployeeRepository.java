package com.cg.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cg.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT e FROM Employee e LEFT JOIN FETCH e.department")
	List<Employee> getAllEmployeesWithDept();

    @Query("SELECT e.id, e.name, e.salary, d.name, d.managerName FROM Employee e JOIN e.department d where d.name = :deptName")
    List<Object[]> findByDepartmentName(String deptName);

    @Query("SELECT DISTINCT e FROM Employee e JOIN e.mobileNumbers m WHERE m = :mobile")
    List<Employee> findByMobileNumber(String mobile);
}