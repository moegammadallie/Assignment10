package Domain.user;

public class Employee {

    private int empNumber;
    private String empFirstName;
    private String empLastName;

    private Employee (){

    }

    public Employee(Builder builder){

        this.empNumber = builder.empNumber;
        this.empFirstName = builder.empFirstName;
        this.empLastName = builder.empLastName;

    }

    public int getEmpNumber(){
        return empNumber;
    }

    public void setEmpNumber(int empNumber){
        this.empNumber = empNumber;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName){
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName){
        this.empLastName = empLastName;
    }

    public static class Builder{

        private int empNumber;
        private String empFirstName;
        private String empLastName;

        public Builder empNumber(int empNumber){
            this.empNumber = empNumber;
            return this;
        }

        public Builder empFirstName(String empFName){
            this.empFirstName = empFName;
            return this;
        }

        public Builder empLastName(String empLName){
            this.empLastName = empLName;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

        public Employee copy(Employee employee){
            this.empNumber = employee.empNumber;
            this.empFirstName = employee.empFirstName;
            this.empLastName = employee.empLastName;
            return employee;
        }
    }
}
