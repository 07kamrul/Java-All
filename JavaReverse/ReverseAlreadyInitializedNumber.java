package JavaReverse;

public class ReverseAlreadyInitializedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123456789;
		int reversenum = 0;
		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse of specified number is: " + reversenum);
	}

}
