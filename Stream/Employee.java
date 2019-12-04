package Stream.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Stream.Stream.Employee.Gender;

public class Employee {
	public static enum Gender{
		Male,Female
	}
	 int id;
	 String name;
	 Gender gender;
	 double salary; 

	public Employee(int id, String name, Gender gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public Gender getGender() {
		return gender;
	}

	public boolean isMale() {
		return this.gender == Gender.Male;
	}
	
	public boolean isFemale() {
		return this.gender == Gender.Female;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static List<Employee> persons() {
	    Employee p1 = new Employee(1, "Jake", Gender.Male, 2343.0);
	    Employee p2 = new Employee(2, "Jack", Gender.Male, 7100.0);
	    Employee p3 = new Employee(3, "Jane", Gender.Female, 5455.0);
	    Employee p4 = new Employee(4, "Jode", Gender.Male, 1800.0);
	    Employee p5 = new Employee(5, "Jeny", Gender.Female, 1234.0);
	    Employee p6 = new Employee(6, "Jason", Gender.Male, 3211.0);
	    List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

	    return persons;
	  }
	@Override
	public String toString() {
	    	 String str = String.format("(%s, %s, %s,  %.2f)\n", id, name, gender, salary);
	    		    return str;
	}
	
	

}
