package info.cafeit.optional;

import info.cafeit.optional.model.Employee;

import java.util.Optional;

public class Example5 {

    public static void main(String[] args) {
		Optional<Employee> emp = Optional.empty();
		System.out.println(emp.orElseThrow(()-> new IllegalStateException("Employee not found!!!")));
		//sẻ bắn ra exception IllegalStateException
    }
}
