package Repository.user;

import Domain.user.Employee;
import Repository.Repository;

import java.util.Set;

public interface EmployeeRepository extends Repository<Employee, Integer> {

    Set<Employee> getAll();

}
