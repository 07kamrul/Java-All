package Enum;

public enum Enum {
	JANUARY("JANUARY",31),
	FEBRUARY("FEBRUARY",28),
	MARCH("MARCH",31),
	APRIL("APRIL",31),
	MAY("MAY",31),
	JUNE("JUNE",31),
	JULY("JULY",31),
	AUGUST("AUGUST",31),
	SEPTEMBER("SEPTEMBER",31),
	OCTOBER("OCTOBER",31),
	NOVEMBER("NOVEMBER",31),
	DECEMBER("DECEMBER",31);
	
	private static String d;
	private final String monthName;
    private final int days;
    
    
	private Enum(String monthName, int days) {
		this.monthName = monthName;
		this.days = days;
	}
	public String getMonthName() {
		return monthName;
	}
	public int getDays() {
		return days;
	}
	
	public static String contains(String s) {
		for(Enum choice:values()) {
			if(choice.getMonthName().substring(0, 3).equals(s)) {
				d = choice.getMonthName() + " " +choice.getDays();
			}
		}
		return d;
	}

}
