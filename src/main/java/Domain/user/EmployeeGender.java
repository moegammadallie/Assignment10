package Domain.user;

public class EmployeeGender {

    private int genderID;
    private int empNumber;

    public EmployeeGender(){

    }

    public int getGenderID() {
        return genderID;
    }

    public void setGenderID(int genderID) {
        this.genderID = genderID;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public EmployeeGender employeeGender(int empNumber, int genderId){


        this.empNumber = empNumber;
        this.genderID = genderId;
        return this;


    }

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "empNumber='" + empNumber + '\'' +
                ", genderID='" + genderID + '\'' +
                '}';
    }

}
