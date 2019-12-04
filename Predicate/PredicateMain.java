package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateMain {

	public PredicateMain() {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp = new Employee(1,"Google",214000.25);
		Employee emp1 = new Employee(2,"Facebook",214.25);
		Employee emp2 = new Employee(3,"Yahoo",214.25);
		Employee emp3 = new Employee(4,"ebay",214.25);
		
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		System.out.println(empList);
		printEmp(empList,(empOne)-> empOne.getName().equals("Google"));
		printEmp(empList,(empOne)-> empOne.getSalary()>40000.2);
		printEmp(empList, (empOne) -> empOne.getId() == 3);
		Predicate<Employee> predicateOne = (empOne)-> empOne.getName().equals("google");
		Predicate<Employee> predicateTwo = (empOne)-> empOne.getSalary()>200.0;
		printEmp(empList, predicateOne.and(predicateTwo));
		
		printEmpInt(empList,(id)->id==3);
		Integer in = 20;
		int k = in;
	}
	
	private void printEmpInt(List<Employee> empList, IntPredicate predicate) {
		// TODO Auto-generated method stub
		for(Employee employee : empList) {
			if(predicate.test(employee.getId())) {
				System.out.println(employee);
			}
		}
		System.out.println("............................");
	}

	private void printEmp(List<Employee> empList, Predicate<Employee> predicate) {
		// TODO Auto-generated method stub
		Consumer<Employee> consEmp =  (empOne)->{
			if(predicate.test(empOne)) {
				System.out.println(empOne);
			}
		};
		empList.forEach(consEmp);
		System.out.println("------------------------------");
	}


}
