package cg.demo.spring.Assignment8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
    
	private Map<Integer,Employee> emap=new HashMap<Integer,Employee>();
	
	
	public void insert(int eid,String name,double sal)
	{
		Employee e=new Employee();
		e.setEid(eid);
		e.setEname(name);
		e.setEsal(sal);
		emap.put(eid,e);
	}
	public Employee getById(int id)
	{
		return emap.get(id);
	}
	public void delete(int id)
	{
		emap.remove(id);
	}
	public Map<Integer, Employee> getEmap() {
		return emap;
	}
	public void setEmap(Map<Integer, Employee> emap) {
		this.emap = emap;
	}
	public List<Employee> fetchAll() {
		return new ArrayList<>(emap.values());
	}
	

}
