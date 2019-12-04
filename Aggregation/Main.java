package Aggregation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad = new Address(55, "Agra", "UP", "India");
		StudentClass obj = new StudentClass(123, "Chaitanya", ad);
		System.out.println(obj.rollNum);
		System.out.println(obj.studentName);
		System.out.println(obj.studentAddr.streetNum);
		System.out.println(obj.studentAddr.city);
		System.out.println(obj.studentAddr.state);
		System.out.println(obj.studentAddr.country);
	}

}
