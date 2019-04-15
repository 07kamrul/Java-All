package Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class GetCurrentDateAndTimeInDefaultFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime current = LocalDateTime.now();
		/* Current date and time in default format */
		System.out.println("Current Date and Time is: " + current);
		/* Current date and time with pattern */
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		String formatted = current.format(formatter);

		System.out.println("Current Date and Time is: " + formatted);
		/* Current Date time using predefined constants */
		DateTimeFormatter formatter1 = DateTimeFormatter.BASIC_ISO_DATE;
		String formatted1 = current.format(formatter1);

		System.out.println("Current Date is: " + formatted1);

		/* Current Date time in localized style */
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		String formatted2 = current.format(formatter2);

		System.out.println("Current Date is: " + formatted2);
	}

}
