package day5;

public enum Weekdays {
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	public static void main(String[] args) {
		for(Weekdays day:Weekdays.values()) {
			System.out.println(day);
		}
	}
}
