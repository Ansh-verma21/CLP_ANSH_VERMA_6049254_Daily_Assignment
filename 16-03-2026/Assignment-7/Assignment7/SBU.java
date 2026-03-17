package Assignment7;

import java.util.List;

public class SBU {
	private String sbuCode;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList;
	public String getSbuCode() {
		return sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public void show() {
		System.out.println("SBU Details");
		System.out.println("---------------------------");
		System.out.println("sbuCode=" + sbuCode + ", sbuHead=" + sbuHead + ", sbuName=" + sbuName );
		System.out.println("Employee details");
		System.out.print("Employee [");
		for(Employee e:empList)
		{
			System.out.print(e);
		}
		System.out.print("]");
		
		
	}
	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", empList=" + empList
				+ "]";
	}

}
