package ExceptionHandling;

public class StringIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str = "beginnersbook";
			System.out.println(str.length());
			;
			char c = str.charAt(0);
			c = str.charAt(40);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException!!");
		}
	}

}
