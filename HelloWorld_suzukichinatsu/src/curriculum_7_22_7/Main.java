package curriculum_7_22_7;

interface Salary {
	int calculateSalary();

	String getName();
}

class FullTimeEmployee implements Salary {
	private int hours;
	private String name;

	public FullTimeEmployee(int hours, String name) {
		this.name = name;
		this.hours = hours;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int calculateSalary() {
		return hours * 1200;
	}
}

class ContractEmployee implements Salary {
	private int hours;
	private String name;

	public ContractEmployee(int hours, String name) {
		this.name = name;
		this.hours = hours;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int calculateSalary() {
		return hours * 1000;
	}
}

class Reporter {
	public void report(Salary s) {
		System.out.println(s.getName() + " の給料は " + s.calculateSalary() + " 円");

	}
}

public class Main {

	public static void main(String[] args) {
		Salary sa1 = new FullTimeEmployee(9, "田中");
		Salary sa2 = new ContractEmployee(9, "佐藤");

		Reporter re = new Reporter();
		re.report(sa1);
		re.report(sa2);
	}

}
