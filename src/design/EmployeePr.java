package design;

public abstract class EmployeePr implements Employee {

    final private String dept1 = "IT";
    String dept2 = "HR";
    final String dept3 = "Finance";
    int empId;
    String empName;
    int salary;


    public  abstract void employeeAge();

    public void depName(String dept2){
        System.out.println(dept2);

    }
    public int employeeId(){
       return empId;
    }


    public String employeeName(){
        return empName;
    }

    //assignDepartment() will assign employee to departments
    public void assignDepartment(String dept1){
        System.out.println(dept1);
    }


    public int calculateSalary(){
      return salary;
    }

    //employee benefit
    public void benefitLayout(){

    }


}
