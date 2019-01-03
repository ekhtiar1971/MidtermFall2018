package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo emp1=new EmployeeInfo("Tahsan","HCR",10000);
		EmployeeInfo.calculateEmployeeBonus(60000,8);
		emp1.assignDepartment("IT");
		emp1.dept2="HR";
		emp1.employeeId=102;
		emp1.emplInf();
		int e3=emp1.emId(303);
		System.out.println(e3);
		double g4=emp1.gr(4.5);
		System.out.println(g4);



	}

}
