package cg.demo.spring.Assignment8;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	 private EmployeeDao empd;
	
	public void insert(int eid,String name,double sal)
	{
		
		empd.insert(eid,name,sal);
	}
	public void getId(int id)
	{
		Employee e=empd.getById(id);
		System.out.println("Employee Info");
		System.out.println("Employee ID: "+ e.getEid());
		System.out.println("Employee Name: "+ e.getEname());
		System.out.println("Employee Salary: "+ e.getEsal());
		
	}
	public void delete(int id)
	{
		empd.delete(id);
	}
	public List<Employee> fetchAll() {
		return empd.fetchAll();
	}

}
