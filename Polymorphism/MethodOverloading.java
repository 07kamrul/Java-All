package Polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload Obj = new Overload();
		double result;
		Obj.demo(10);
		Obj.demo(10, 20);
		result = Obj.demo(5.5);
		System.out.println("O/P : " + result);
	}

}
