package Repository.user.impl;

import Domain.user.Employee;
import Repository.user.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl employeeRepository = null;
    private Set<Employee> employees;

    private EmployeeRepositoryImpl(){

        employees = new HashSet<Employee>();

    }


    public static EmployeeRepositoryImpl getEmployeeRepository() {

        if(employeeRepository == null){
            return new EmployeeRepositoryImpl();
        }

        return employeeRepository;
    }

    public Set<Employee> getAll() {

        return employees;

    }

    public Employee create(Employee employee) {

        employees.add(employee);

        return employee;

    }

    public Employee read(Integer integer) {

        return employees.stream().filter(employee -> employee.getEmpNumber() == integer).findAny().orElse(null);

    }

    public Employee update(Employee employee) {

        Employee toDelete = read(employee.getEmpNumber());

        if(toDelete != null) {
            employees.remove(toDelete);
            return create(employee);
        }
        return null;
    }

    public void delete(Integer integer) {

        Employee toDelete = read(integer);
        if (toDelete != null){
            employees.remove(toDelete);
        }

    }



}
