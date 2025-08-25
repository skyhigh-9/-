package curriculum_7_22_4;

public class FullTimeEmployee {
	private static final int HOURLY_RATE = 1200;

	public int calculateDailyWage(int hoursWorked) {
		int i = 0;
		double j = 1.25;
		if (hoursWorked > 8) {
             i = (int) (j * HOURLY_RATE);
           return((hoursWorked-8) * i) + (8 * HOURLY_RATE);
		}
		return hoursWorked * HOURLY_RATE;
		
	}

}
