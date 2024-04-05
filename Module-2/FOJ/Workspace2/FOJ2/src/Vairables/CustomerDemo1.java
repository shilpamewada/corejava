package Vairables;

public class CustomerDemo1 {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(1001,"SACHIN","TENDULKAR","20-20, EAST, MUMBAI",9999.99);
		System.out.println(c1); //it calls toString()
		c1.setLastName("RAMESH TENDULKAR");
		System.out.println(c1);
		
		Customer c2 = new Customer(1002,"MS","DHONI","50-50, SOUTH, CHENNAI",8888.88);
		System.out.println(c2); //it calls toString()
		c2.setAddress("10-10, NORTH, DELHI");
		System.out.println("Ur Address is : " + c2.getAddress());
		
		Customer c3 = new Customer();
		System.out.println(c3);

	}

}

class Customer{
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private double balance;
	
	public Customer(){
		
	}
	public Customer(int id, String firstName, String lastName, String address, double balance) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.balance = balance;
	}

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", balance=" + balance + "]";
	}
}

