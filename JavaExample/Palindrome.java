package JavaExample;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverseString = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string to check if it is a palindrome:");
		String inputString = scanner.nextLine();

		int length = inputString.length();

		for (int i = length - 1; i >= 0; i--)
			reverseString = reverseString + inputString.charAt(i);

		if (inputString.equals(reverseString))
			System.out.println("Input string is a palindrome.");
		else
			System.out.println("Input string is not a palindrome.");
	}

}
