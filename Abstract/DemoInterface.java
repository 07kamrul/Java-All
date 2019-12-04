package Abstract;

public class DemoInterface implements Multiply {
	public int multiplyTwo(int num1, int num2) {
		return num1 * num2;
	}

	public int multiplyThree(int num1, int num2, int num3) {
		return num1 * num2 * num3;
	}
}
