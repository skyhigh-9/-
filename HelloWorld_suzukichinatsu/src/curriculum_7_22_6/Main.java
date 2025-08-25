package curriculum_7_22_6;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Billable> epy = new ArrayList<>();
		epy.add(new FullTimeEmployee("E1", "田中"));
		epy.add(new FullTimeEmployee("E2", "斎藤"));
		epy.add(new ContractEmployee("C1", "中村"));
		epy.add(new ContractEmployee("C2", "佐藤"));
		for(Billable i:epy) {
			System.out.println("日給:" + i.costForDay(9) + "円");
		}
	}

}
