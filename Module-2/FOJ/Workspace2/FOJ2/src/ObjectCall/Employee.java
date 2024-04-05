package ObjectCall;

public class Employee {
	int id;
	String name;
	int Salary;
	
	public Employee(int id,String name,int Salary){              //Constructor
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
	
	public void Details() {
		// TODO Auto-generated method stub
		System.out.println(id);
		System.out.println(name);
		System.out.println(Salary);
		
		

	}

}