package user;

import Domain.demography.Gender;
import Domain.demography.Race;
import Domain.user.Employee;
import Domain.user.EmployeeGender;
import Factory.demography.GenderFactory;
import Factory.demography.RaceFactory;
import Factory.user.EmployeeFactory;
import Factory.user.EmployeeGenderFactory;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Project.Controller.User.EmployeeController;

public class EmployeeControllerTest {


    private EmployeeController employeeController;


    @Before
    public void setUp() throws Exception {
        employeeController = new EmployeeController();
    }

    @Test
    public void create() {

        Gender gender = GenderFactory.buildGender(1, "M");
        Race race = RaceFactory.buildRace(1,"Brown");
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(1, 1);
        Employee employee = EmployeeFactory.getEmployee(1, "Moegammad", "Allie");

        employeeController.create(employee.getEmpNumber(), employee.getEmpLastName(),employee.getEmpLastName(), gender.getId(),race.getRaceNum());
    }
}