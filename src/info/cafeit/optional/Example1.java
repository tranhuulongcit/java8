package info.cafeit.optional;

import info.cafeit.optional.model.Employee;
import java.util.Optional;

public class Example1 {

    public static void main(String[] args) {
	    EmployeeRepository employeeRepository = new EmployeeRepository();

	    //check null theo cách truyền thống
		Employee employee1 = employeeRepository.findById(2);
		if (employee1 != null) {
			System.out.println(employee1.getId() + " - " + employee1.getFirstName() + employee1.getLastName());
		}
		//check null sử dụng optional
		//cách 1
	    Optional<Employee> employee = employeeRepository.findByIdUsingOptional(2);
	    employee.ifPresent(e -> {
            System.out.println(e.getId() + " - " + e.getFirstName() + e.getLastName());
        });
		//cách 2
	    if (employee.isPresent()) {
            System.out.println(employee.get().getId() + " - " + employee.get().getFirstName() + employee.get().getLastName());
        }
	    //optional tham chiếu đối tượng null
	    Employee emp = null;
	    //Optional.ofNullable - cho phép đối tượng truyền vào là null
	    Optional<Employee> employee2 = Optional.ofNullable(emp);
		// Optional.of - ném ra lỗi NullPointerException nếu giá trị truyền vào bằng null
	    //Optional<Employee> employee3 = Optional.of(emp);
	    System.out.println(employee2);
    }
}
