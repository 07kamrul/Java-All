package ExceptionHandling;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[10];
			// Array has only 10 elements
			a[11] = 9;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds");
		}
	}

}
