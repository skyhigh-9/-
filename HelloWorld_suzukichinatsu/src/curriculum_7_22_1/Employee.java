package curriculum_7_22_1;

public class Employee {

	String name;
	String employeeId;
	
	void work() {
		System.out.println(name + "は働いています。");
	}

	Employee(String name) {
		this.name = name;
	}

	//	private String name;
	//
	//	public void setName(String name) {
	//		this.name = name;
	//	}
	//
	//	public void work() {
	//		System.out.println(name + "は働いています。");
	//	}
	//	
	

}