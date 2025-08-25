package curriculum_7_22_2;

public class Employee {

	String name;
	String employeeId;
	

	Employee(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	void showInfo() {
		System.out.println("社員ID:" + employeeId + "," + "名前:" + name);
	}

	
	//	
	//	public String employeeId;
	//
	//	public void setId(String employeeId) {
	//		this.employeeId = employeeId;
	//	}
	//
	//	
	//	public String name2;
	//	public void Name2(String name2) {
	//		this.name2 = name2;
	//	}
	//
	//	
	//	public void showInfo() {
	//		System.out.println("社員ID:"+employeeId+","+"名前:"+name2);
	//	}

	
	
}
