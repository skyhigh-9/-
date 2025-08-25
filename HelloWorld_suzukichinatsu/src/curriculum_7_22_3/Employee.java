package curriculum_7_22_3;

public class Employee {

	String name;
	String employeeId;

	Employee(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	public void setEmployeeId(String id) {
		this.employeeId = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
