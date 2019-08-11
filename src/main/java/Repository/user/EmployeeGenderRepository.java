package Repository.user;

import Domain.user.EmployeeGender;
import Repository.Repository;

import java.util.Set;

public interface EmployeeGenderRepository extends Repository<EmployeeGender, Integer> {

    Set<EmployeeGender> getAll();

}
