package za.ac.cput.Project.Controller.User;

import Domain.demography.Gender;
import Domain.demography.Race;
import Domain.user.Employee;
import Domain.user.EmployeeGender;
import Factory.demography.GenderFactory;
import Factory.demography.RaceFactory;
import Factory.user.EmployeeFactory;
import Factory.user.EmployeeGenderFactory;
import Service.demography.GenderService;
import Service.demography.RaceService;
import Service.demography.impl.GenderServiceImpl;
import Service.demography.impl.RaceServiceImpl;
import Service.user.EmployeeGenderService;
import Service.user.EmployeeService;
import Service.user.impl.EmployeeGenderServiceImpl;
import Service.user.impl.EmployeeServiceImpl;

public class EmployeeController {

    private EmployeeService employeeService = EmployeeServiceImpl.getService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getService();
    private RaceService raceService = RaceServiceImpl.getService();
    private GenderService genderService = GenderServiceImpl.getService();

    public void create(int empId, String firstName, String lastName, int genderId, int raceId) {

        Employee employee = EmployeeFactory.getEmployee(empId, firstName, lastName);
        employeeService.create(employee);

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(empId, genderId);
        employeeGenderService.create(employeeGender);

        Race race = RaceFactory.buildRace(raceId, "Race");
        raceService.create(race);

        Gender gender = GenderFactory.buildGender(genderId, "None");
        genderService.create(gender);
    }
}
