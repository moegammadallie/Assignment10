package Service.user;

import Domain.user.Employee;
import Service.Service;

import java.util.Set;

public interface EmployeeService extends Service<Employee, Integer> {
    Set<Employee> getAll();
}
