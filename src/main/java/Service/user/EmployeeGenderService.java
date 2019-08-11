package Service.user;

import Domain.user.EmployeeGender;
import Service.Service;

import java.util.Set;

public interface EmployeeGenderService extends Service<EmployeeGender, Integer> {
    Set<EmployeeGender> getAll();
}
