package Polymorphism;

public class DynamicPolymorphismMain extends DynamicPolymorphism {

	public void myMethod() {
		System.out.println("Overriding Method");
	}

	public static void main(String args[]) {
		DynamicPolymorphism obj = new DynamicPolymorphismMain();
		obj.myMethod();
	}

}
