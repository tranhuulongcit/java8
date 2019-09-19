package info.cafeit.optional;

import info.cafeit.optional.model.Employee;

import java.util.Optional;

public class Example6 {

    public static void main(String[] args) {
		Optional<Employee> emp = Optional.of(new Employee(1));
		Optional<Optional<Employee>> multiOptional = Optional.of(emp);

		System.out.println(multiOptional);// kết quả Optional[Optional[Employee{id=1}]]
		System.out.println(multiOptional.map(gender -> gender.map(Employee::getId))); //Optional[Optional[1]]
		System.out.println(multiOptional.flatMap(gender -> gender.map(Employee::getId))); //Optional[1]
    }
}
