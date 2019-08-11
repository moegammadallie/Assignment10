package Factory.user;

import Domain.user.Employee;

public class EmployeeFactory {

    public static Employee getEmployee(int empNumber, String fName, String lName ){
        return new Employee.Builder()
                .empNumber(empNumber)
                .empFirstName(fName)
                .empLastName(lName)
                .build();
    }
}
