package SwapTwoValue;

public class swap {
	void swapTwo(int a ,int b) {
		if (a == b) {
			return;
		}
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("X : "+a+" Y : "+b);
	}
}
