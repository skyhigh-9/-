package curriculum_7_22_5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> epy = new ArrayList<>();
		epy.add(new FullTimeEmployee("E1", "田中"));
		epy.add(new FullTimeEmployee("E2", "斎藤"));
		epy.add(new ContractEmployee("C1", "中村"));
		epy.add(new ContractEmployee("C2", "佐藤"));
		for(Employee i:epy) {
			int money = i.calculateDailyWage(9);
			System.out.println("社員ID:" + i.id + "/名前:" + i.name + "/給料:" + money);
		}
	}

}
