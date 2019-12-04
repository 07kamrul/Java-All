package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;

public class FunctionExample {
	public FunctionExample() {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp = new Employee(1,"google",23455.25);
		Employee emp1 = new Employee(2,"google",2485.25);
		Employee emp2 = new Employee(2,"google",3655.25);
		Employee emp3 = new Employee(3,"google",45855.25);
		
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		System.out.println(empList);
		
		Function<Employee,Employee> fun = (empOne) ->{
			empOne.setName(empOne.getName().toUpperCase());
			return empOne;
		};
		
		Function<Employee,String> funOne = (empOne) -> empOne.getName();
		
		ToDoubleFunction<Employee> salaryfun = (empOne) -> empOne.getSalary();
		
		Employee newEmp = fun.apply(emp);
		System.out.println(newEmp);
		
		String name = funOne.apply(emp);
		System.out.println(name);
		
		System.out.println(salaryfun.applyAsDouble(emp));
		
		BiFunction<Employee, Employee, Double> biFun = (empOne,empTwo) -> empOne.getSalary() + empTwo.getSalary();
		
		ToDoubleBiFunction<Employee, Employee> biFunDouble = (empOne,empTwo) -> empOne.getSalary() + empTwo.getSalary();
		
		Double res = biFun.apply(emp, emp1);
		System.out.println(res);
		
		System.out.println(biFunDouble.applyAsDouble(emp, emp1));
		
		Function<Employee,Employee> toUpper = (empOne) ->{
			System.out.println("To Upper");
			empOne.setName(empOne.getName().toUpperCase());
			return empOne;
		};
		Function<Employee,Employee> toLower = (empOne) ->{
			System.out.println("To Lower");
			empOne.setName(empOne.getName().toLowerCase());
			return empOne;
		};
		
		toUpper.andThen(toLower).apply(emp);
		System.out.println("................");
		toUpper.compose(toLower).apply(emp);
	}
}
