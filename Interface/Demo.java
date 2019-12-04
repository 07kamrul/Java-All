package Interface;

public class Demo implements MyInterface {

//	public void method1() {
//		int a=10 , b=20 ,sum= 0;
//		sum = a+b;
//		System.out.println("Sum : "+sum);
//	}

	public void method2() {
		System.out.println("implementation of method2");
	}
//
//	public static void main(String arg[]) {
//		MyInterface obj = new Demo();
//		obj.method1();
//	}

	public int method1(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
}
