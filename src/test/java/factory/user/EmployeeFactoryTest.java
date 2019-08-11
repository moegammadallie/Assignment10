package factory.user;

import Domain.user.Employee;
import Factory.user.EmployeeFactory;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeFactoryTest {

    @Test
    public void getEmployee() {
        Employee employee = EmployeeFactory.getEmployee(1, "Moegammad", "Allie");
        Assert.assertNotNull(employee);
    }
}