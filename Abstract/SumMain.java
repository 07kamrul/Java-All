package Abstract;

public class SumMain {


	public static void main(String args[]) {
		Sum obj = new Demo();
		System.out.println(obj.sumOfTwo(3, 7));
		System.out.println(obj.sumOfThree(4, 3, 19));
		obj.disp();
	}
}
