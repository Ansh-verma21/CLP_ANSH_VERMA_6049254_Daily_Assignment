package cg.demo.spring.Assignment8;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int eid;
	private String ename;
	private double esal;
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	

}
