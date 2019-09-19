package info.cafeit.optional;

import info.cafeit.optional.model.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository {

    private static List<Employee> employees = new ArrayList<>();

    private void init() {
        employees.add(new Employee(1, "Nguyen Van", "A", new Date(), 1));
        employees.add(new Employee(2, "Nguyen Van", "B", new Date(), 1));
        employees.add(new Employee(3, "Nguyen Van", "C", new Date(), 1));
        employees.add(new Employee(4, "Nguyen Van", "D", new Date(), 1));
    }

    public EmployeeRepository() {
        init();
    }

    Optional<Employee> findByIdUsingOptional(Integer id) {
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }

    Employee findById(Integer id) {
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }
}
