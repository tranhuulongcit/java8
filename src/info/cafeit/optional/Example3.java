package info.cafeit.optional;

import info.cafeit.optional.model.Employee;

import java.util.List;
import java.util.Optional;

public class Example3 {


	public static Integer getId() {
		Employee emp = new Employee();
		if (emp != null && emp.getId() != null) {
			return emp.getId();
		}
		return -9999;
	}

	public static Integer getIdUsingJava8() {
		Optional<Employee> emp = Optional.ofNullable(new Employee());
		return emp.map(Employee::getId)
				.orElse(-9999);
	}

    public static void main(String[] args) {
		//Sử dụng cách truyền thống
		System.out.println(getId());
		//sử dụng optional va java 8
	    System.out.println(getIdUsingJava8());
    }
}
