package JavaExample;

public class FibonacciSequenceUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 7, num1 = 0, num2 = 1;
		System.out.print("Fibonacci Series of " + count + " numbers:");

		int i = 1;
		while (i <= count) {
			System.out.print(num1 + " ");
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
			i++;
		}
	}

}
