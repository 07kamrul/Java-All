package Predicate;

import java.util.function.Supplier;

public class SupplierExample {

	public SupplierExample() {
		Supplier<Employee> supplier = () -> new Employee();
		System.out.println(supplier.get());
	}
}
