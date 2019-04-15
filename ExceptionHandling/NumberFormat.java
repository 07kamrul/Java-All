package ExceptionHandling;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = Integer.parseInt("XYZ");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception occurred");
		}
	}

}
