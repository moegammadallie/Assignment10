package Repository.user.impl;

import Domain.user.EmployeeGender;
import Repository.user.EmployeeGenderRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {


    private static EmployeeGenderRepositoryImpl employeeGenderRepository = null;
    private Set<EmployeeGender> employeeGenders;

    private EmployeeGenderRepositoryImpl(){

        employeeGenders = new HashSet<EmployeeGender>();

    }

    public static EmployeeGenderRepositoryImpl getEmployeeGenderRepository() {

        if(employeeGenderRepository == null){
            return new EmployeeGenderRepositoryImpl();
        }

        return employeeGenderRepository;
    }

    public Set<EmployeeGender> getAll() {

        return employeeGenders;

    }

    public EmployeeGender create(EmployeeGender employeeGender) {

        employeeGenders.add(employeeGender);

        return employeeGender;

    }

    public EmployeeGender read(Integer integer) {

        return employeeGenders.stream().filter(employeeGender -> employeeGender.getEmpNumber() == integer).findAny().orElse(null);

    }

    public EmployeeGender update(EmployeeGender employeeGender) {

        EmployeeGender toDelete = read(employeeGender.getEmpNumber());

        if(toDelete != null) {
            employeeGenders.remove(toDelete);
            return create(employeeGender);
        }
        return null;
    }

    public void delete(Integer integer) {

        EmployeeGender toDelete = read(integer);
        if (toDelete != null){
            employeeGenders.remove(toDelete);
        }

    }

}
