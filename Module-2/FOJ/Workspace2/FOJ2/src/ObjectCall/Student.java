package ObjectCall;

public class Student {
	int id;
	String name;
	
	public Student(){              //Constructor
		System.out.println("This is a defualt constructor");
	}
	
	public Student(int id,String name){              //Parameterised Constructor
		this.id=id;
		this.name=name;
	}
	
	

	public void details() {
		// TODO Auto-generated method stub
		System.out.println(id);
		System.out.println(name);
		

	}

}