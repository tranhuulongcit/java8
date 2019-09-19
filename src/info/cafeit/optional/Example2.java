package info.cafeit.optional;

import info.cafeit.optional.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Example2 {

	public static Employee getEmployee1() {
		return null;
	}

	public static Optional<Employee> getEmployee2() {
		return Optional.ofNullable(null);
	}

    public static void main(String[] args) {
		//Sử dụng cách truyền thống
		Employee emp1 = getEmployee1();
		Employee empOption = emp1 != null ? emp1 : new Employee(1);

		//sử dụng optional
		Employee emp2 = getEmployee2().orElse(new Employee(2));

		Employee emp3 = getEmployee2().orElseGet(() -> new Employee(2));
	    System.out.println(emp2);
	    System.out.println(emp3);
    }
}
