package info.cafeit.optional;

import info.cafeit.optional.model.Employee;

import java.util.Optional;

public class Example4 {

    public static void main(String[] args) {
		Optional<Employee> emp = Optional.ofNullable(new Employee(1));
		System.out.println(emp.filter(e -> e.getId().equals(1))); //return về đối tượng Optional[Employee{id=1}]
	    System.out.println(emp.filter(e -> e.getId().equals(2))); //return về đối tượng Optional.empty
    }
}
